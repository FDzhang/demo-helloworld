package com.fd.demohelloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zxq
 * @date ：Created in 2020/12/22 15:20
 */
@RestController
@RequestMapping
@Slf4j
public class HelloWroldController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }
}
