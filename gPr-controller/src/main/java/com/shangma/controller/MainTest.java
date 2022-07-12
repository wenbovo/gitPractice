package com.shangma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BOGEY
 * 2022/7/12  14:37
 */
@RestController
public class MainTest {

    @GetMapping("test1")
    public String Test1(){
        return "test1 is very good";

    }
}
