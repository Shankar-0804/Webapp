package com.shankar.user;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    UserService userService;

    @PostMapping
    public UserOutDto create(@RequestBody UserInDto userInDto){
        return userService.create(userInDto);
    }

    @GetMapping
    public List<UserOutDto> findAll(){
        return userService.findAll();
    }

    @GetMapping("{id}")
    public UserOutDto find(@PathVariable long id){
        return userService.find(id);
    }

    @PutMapping("{id}")
    public UserOutDto update(@PathVariable long id, @RequestBody UserInDto userInDto){
        return userService.update(id, userInDto);
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
