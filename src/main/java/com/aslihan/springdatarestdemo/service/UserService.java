package com.aslihan.springdatarestdemo.service;

import com.aslihan.springdatarestdemo.dto.UserDto;
import com.aslihan.springdatarestdemo.entity.User;
import com.aslihan.springdatarestdemo.mapper.UserMapper;
import com.aslihan.springdatarestdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDto> findAllUser() {
        List<User> userList = userRepository.findAll(Sort.by("name").ascending());
        return userMapper.toDto(userList);
    }

    public UserDto save(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        return userMapper.toDto(userRepository.save(user));
    }
}
