package com.restservice.controller;

import com.restservice.dto.UserDto;
import com.restservice.exception.ServiceException;
import com.restservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers() throws ServiceException {
        List<UserDto> users = userService.getAll();
        return new ResponseEntity<List<UserDto>>(users, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

/*    @GetMapping("/users")
    public String getAllUsers(Principal principal, Model model) throws ServiceException {
        List<UserDto> users = userService.getAll();
        model.addAttribute("users", users);
        model.addAttribute("username", principal.getName());
        return "users";
    }*/
}
