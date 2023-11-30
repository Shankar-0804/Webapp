package com.shankar.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserOutDto create(UserInDto userInDto);

    List<UserOutDto> findAll();

    UserOutDto find(long id);

    UserOutDto update(long id, UserInDto userInDto);

    void delete(long id);

    void deleteAll();

}
