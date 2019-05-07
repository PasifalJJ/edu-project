package com.literary.user.impl;

import com.literary.SalaryController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@RequestMapping("/salary")
@Controller
public class SalaryControllerImpl implements SalaryController {

    @RequestMapping("/salaryManage")
    @Override
    public String showSalaryManager() {
        return "/salary/manage";
    }


    @Override
    @RequestMapping("/showSalaryInfo")
    public String showSalaryInfo() {
        return "salary/info";
    }
}
