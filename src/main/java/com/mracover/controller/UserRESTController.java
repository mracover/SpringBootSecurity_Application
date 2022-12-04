package com.mracover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mracover.entity.User;
import com.mracover.service.UserServiceImp;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class UserRESTController {

    private final UserServiceImp userService;

    @Autowired
    public UserRESTController(UserServiceImp userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<User> userGet(Principal principal) {
        return new ResponseEntity<>(userService.findByUsername(principal.getName()), HttpStatus.OK);
    }
}
