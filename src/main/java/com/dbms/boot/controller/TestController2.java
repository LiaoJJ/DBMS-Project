package com.dbms.boot.controller;

import com.dbms.boot.domain.Country;
import com.dbms.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/db")
public class TestController2 {

    @Autowired
    private TestService service;

//    @GetMapping("/aaa")
//    public String test1() {
//        return service.test1("AUS").getNAME();
//    }

    @GetMapping("/bbb")
    public List<Country> test2() {
        return service.test2();
    }
}
