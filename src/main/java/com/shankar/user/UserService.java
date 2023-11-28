package com.shankar.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDto create(UserDto userDto);

    List<UserDto> findAll();

    UserDto find(long id);

    UserDto update(long id, UserDto userDto);

    void delete(long id);

    void deleteAll();
}
