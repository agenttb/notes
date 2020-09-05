package com.agenttb.code.spring.controller;

import com.agenttb.code.spring.aop.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class HelloWorldController {

    @Resource
    AccountService accountService;

    @GetMapping("/get")
    public String get(HttpServletRequest servletRequest) {
        accountService.query();
        return "test";
    }
}
