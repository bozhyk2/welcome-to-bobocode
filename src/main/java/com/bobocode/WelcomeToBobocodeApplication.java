package com.bobocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class WelcomeToBobocodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeToBobocodeApplication.class, args);
    }

    @GetMapping({"", "/welcome"})
    public String welcome() {
        return "welcome";
    }
}
