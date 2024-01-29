package com.youcode.springsecuritylab.controllers;

import com.youcode.springsecuritylab.models.dtos.EntityResponse;
import com.youcode.springsecuritylab.services.RoleService;
import com.youcode.springsecuritylab.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RoleService roleService;


    @GetMapping("user-list")
    public ResponseEntity<Object> getAllUserList(){
        return EntityResponse.generateResponse("Admin Fetch User List", HttpStatus.OK,
                userService.retrieveAllUserList());
    }

    @GetMapping("role-list")
    public ResponseEntity<Object> getAllRoleList(){
        return EntityResponse.generateResponse("Admin Fetch Role List", HttpStatus.OK,
                roleService.findAllRole());
    }
}
