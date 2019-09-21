package com.restservice.service;

import com.restservice.converter.IDtoConverter;
import com.restservice.converter.UserDtoConverter;
import com.restservice.dao.UserDao;
import com.restservice.dto.UserDto;
import com.restservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, UserDto> {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDao getDao() {
        return userDao;
    }

    @Override
    public IDtoConverter<User, UserDto> getDtoConverter() {
        return new UserDtoConverter();
    }
}
