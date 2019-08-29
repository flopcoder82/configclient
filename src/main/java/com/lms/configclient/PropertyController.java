package com.lms.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("properties")
public class PropertyController {
    @Value("${token.secret}")
    String token;

    @Value("${server.port}")
    private String port;
    @GetMapping("/status/check")
    public String status() {
        return "Working on port " + port + " with token " + token;
    }
}
