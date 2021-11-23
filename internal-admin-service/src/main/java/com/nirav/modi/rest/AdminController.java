package com.nirav.modi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {

    @GetMapping("/adminDetail")
    public Object getAdmin() {

        return "{'username':'admin','password':'OhMyGod@123'}";
    }

    @GetMapping("/dbDetail")
    public Object getDbDetails() {

        return "{'dbName':'controller','host':'10.0.1.35','username':'root', 'password':'XSuper@#12345', 'port':'5432'}";
    }
}
