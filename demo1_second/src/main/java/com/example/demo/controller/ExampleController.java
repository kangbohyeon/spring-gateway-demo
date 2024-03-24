package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
@Slf4j
public class ExampleController {

    @GetMapping("/temp")
    public String example(HttpServletRequest request) {
        log.info("request uri -> " + request.getRequestURI());
        log.info("ip -> " + request.getRemoteAddr());
        log.info("demo1 temp call!!");
        return "demo1/temp : " + request.getServerPort();
    }

    @GetMapping("/temp2")
    public String example2(HttpServletRequest request) {
        log.info("request uri -> " + request.getRequestURI());
        log.info("ip -> " + request.getRemoteAddr());
        log.info("demo1 temp2 call!!");
        return "demo1/temp2 : " + request.getServerPort();
    }
}
