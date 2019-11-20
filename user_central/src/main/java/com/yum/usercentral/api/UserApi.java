package com.yum.usercentral.api;

import com.yum.model.sys.model.User;
import com.yum.model.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wqing
 * @date ：Created in 2019/11/20 0020 21:56
 */
@RestController
@RequestMapping(value = "/user")
public class UserApi {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResponseEntity register(
            @RequestBody User user
    ){
        userService.register(user.getUserName(),user.getPassword());
        return ResponseEntity.ok().build();
    }

}
