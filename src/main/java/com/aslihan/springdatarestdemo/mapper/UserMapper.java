package com.aslihan.springdatarestdemo.mapper;

import com.aslihan.springdatarestdemo.dto.UserDto;
import com.aslihan.springdatarestdemo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper (componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper extends EntityMapper<UserDto, User> {
}
