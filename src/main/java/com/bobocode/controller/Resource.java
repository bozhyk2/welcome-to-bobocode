package com.bobocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.Callable;

@Controller
public class Resource {

    @GetMapping({"", "/welcome"})
    public Callable<String> welcome() {
        return () -> "welcome";
    }
}