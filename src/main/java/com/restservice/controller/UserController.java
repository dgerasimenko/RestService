package com.restservice.controller;


import com.restservice.dto.UserDto;
import com.restservice.exception.ServiceException;
import com.restservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<List<UserDto>> getUserById(@PathVariable("id") Long id) throws ServiceException {
        List<UserDto> users = userService.getAll();
        return new ResponseEntity<List<UserDto>>(users, new HttpHeaders(), HttpStatus.OK);
    }
}
