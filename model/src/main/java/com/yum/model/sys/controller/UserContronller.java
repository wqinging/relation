package com.yum.model.sys.controller;

import com.yum.model.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/13 0013 21:14
 */
@RestController
@RequestMapping("/user")
public class UserContronller {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResponseEntity register(String userName,String password){
        userService.register(userName,password);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResponseEntity login(String userName,String password){
        userService.getUserByUserNameAndPassword(userName,password);
        return ResponseEntity.ok().build();
    }

}
