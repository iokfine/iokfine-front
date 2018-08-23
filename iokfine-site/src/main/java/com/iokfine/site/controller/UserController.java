package com.iokfine.site.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "error";

    @GetMapping("user/{id}")
    public String login(@PathVariable Integer id){
        log.info("User ID: "+id);
        if (id == 1) {
            return SUCCESS;
        }
        return FAIL;
    }
}
