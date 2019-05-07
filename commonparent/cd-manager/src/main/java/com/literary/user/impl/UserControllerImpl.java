package com.literary.user.impl;

import com.literary.user.IUserService;
import com.literary.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @date
 */
@Controller
@RequestMapping("/user")
public class UserControllerImpl implements UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService userService;

    @Override
    @RequestMapping("/userManage")
    public String showUserManager() {
        return "user/manage";
    }

    @Override
    @RequestMapping("/showDefault")
    public String showDefault() {
        return "/default";
    }

    @Override
    @RequestMapping("/showInfo")
    public String showInfo() {
        return "user/info";
    }


}
