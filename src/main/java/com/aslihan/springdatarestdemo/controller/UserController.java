package com.aslihan.springdatarestdemo.controller;

import com.aslihan.springdatarestdemo.dto.UserDto;
import com.aslihan.springdatarestdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAllUser();
    }
    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.save(userDto), HttpStatus.OK);
    }
}
