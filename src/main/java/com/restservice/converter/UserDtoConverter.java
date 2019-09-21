package com.restservice.converter;

import com.restservice.dto.UserDto;
import com.restservice.entity.User;

public class UserDtoConverter extends BaseDtoConverter<User, UserDto> {

    @Override
    public UserDto convertToDto(User user) {
        if (user != null) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setUsername(user.getUsername());
            userDto.setUsername(user.getPassword());
            return userDto;
        }
        return null;
    }

    @Override
    public User convertFromDto(UserDto userDto) {
        if (userDto != null) {
            User user = new User();
            user.setId(userDto.getId());
            user.setUsername(userDto.getUsername());
            user.setUsername(userDto.getPassword());
            return user;
        }
        return null;
    }
}
