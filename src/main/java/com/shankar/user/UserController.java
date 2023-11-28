package com.shankar.user;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    UserService userService;

    @PostMapping
    public UserDto create(@RequestBody UserDto userDto){
        return userService.create(userDto);
    }

    @GetMapping
    public List<UserDto> findAll(){
        return userService.findAll();
    }

    @GetMapping("{id}")
    public UserDto find(@PathVariable long id){
        return userService.find(id);
    }

    @PutMapping("{id}")
    public UserDto update(@PathVariable long id, @RequestBody UserDto userDto){
        return userService.update(id, userDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id){
        userService.delete(id);
    }

    @DeleteMapping
    public void deleteAll(){
        userService.deleteAll();
    }
}
