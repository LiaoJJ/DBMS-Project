package com.dbms.boot.controller;

import com.dbms.boot.entities.Data;
import com.dbms.boot.entities.Form;
import com.dbms.boot.entities.trend1;
import com.dbms.boot.service.TestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


@Controller
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping("/hello")
    public String tt() {
//        model.addAttribute("say","欢迎欢迎,热烈欢迎");
//        map.put("hello", "欢迎进入HTML页面");
        return "index";
    }



    @GetMapping("/search/form")
    public String search_form(Model model){
        model.addAttribute("form", new Form());
        return "search/search-form";
    }

    @GetMapping("/search/show")
    public String search_show(Model model){
        Data data1 = new Data();
        data1.setListingUrl("https://www.tesla.com/");
        data1.setColor("blue");
        data1.setPrice("10000");
        data1.setModel("Corolla");
        data1.setManufacturer("Toyota");
        Data data2 = new Data();
        data2.setColor("red");
        data2.setPrice("20001");
        data2.setModel("Model3");
        data2.setManufacturer("Tesla");
        List<Data> datas = Arrays.asList(data1, data2);
        model.addAttribute("datas", datas);
        return "search/search-show";
    }



    @GetMapping("/trend1/form")
    public String trend1_form(Model model){
        model.addAttribute("form", new Form());
        return "trend/trend1-form";
    }

    @GetMapping("/trend1/show")
    public String trend1_show(Model model) throws JsonProcessingException {
        trend1 t1 = new trend1(2010, 11111);
        trend1 t2 = new trend1(2011, 22222);
        trend1 t3 = new trend1(2012, 11111);
        trend1 t4 = new trend1(2014, 33333);
        trend1 t5 = new trend1(2016, 11111);
        trend1 t6 = new trend1(2017, 33333);
        trend1 t7 = new trend1(2018, 44444);
        trend1 t8 = new trend1(2019, 55555);
        List<trend1> trend1s = Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(trend1s);
        model.addAttribute("jsonString", jsonString);
        return "trend/trend1-show";
    }

}
