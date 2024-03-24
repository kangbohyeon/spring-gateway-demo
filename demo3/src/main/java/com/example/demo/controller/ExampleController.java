package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo3")
@Slf4j
public class ExampleController {

    @GetMapping("/temp")
    public String example(HttpServletRequest request) {
        log.info("request uri -> " + request.getRequestURI());
        log.info("ip -> " + request.getRemoteAddr());
        log.info("demo3 temp call!!");
        return "demo3/temp : " + request.getServerPort();
    }

    @GetMapping("/temp2")
    public String example2(HttpServletRequest request) {
        log.info("request uri -> " + request.getRequestURI());
        log.info("ip -> " + request.getRemoteAddr());
        log.info("demo3 temp2 call!!");
        return "demo3/temp2 : " + request.getServerPort();
    }
}
