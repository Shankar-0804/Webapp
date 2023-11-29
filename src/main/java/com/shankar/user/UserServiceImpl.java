package com.shankar.user;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    UserRepository userRepository;

    @Override
    public UserOutDto create(UserInDto userInDto) {
        UserEntity userEntity = userMapper.mapDtoToEntity(userInDto);
        UserEntity save = userRepository.save(userEntity);
        return userMapper.mapEntityToDto(save);
    }

    @Override
    public List<UserOutDto> findAll() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userMapper.mapEntitiesToDtos(userEntities);
    }

    @Override
    public UserOutDto find(long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(()
                -> new UserException("Id Not Found"));
        return userMapper.mapEntityToDto(userEntity);
    }

    @Override
    public UserOutDto update(long id, UserInDto userInDto) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(()
                -> new UserException("Id Not Found"));
        userMapper.mapDtoToExistingEntity(userInDto, userEntity);
        UserEntity saveUser = userRepository.save(userEntity);
        return userMapper.mapEntityToDto(saveUser);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
