package com.shankar.user;

import lombok.Data;

@Data
public class UserDto {
    private long id;

    private String name;

    private String city;

    private String state;

    private String country;

    private long age;
}
