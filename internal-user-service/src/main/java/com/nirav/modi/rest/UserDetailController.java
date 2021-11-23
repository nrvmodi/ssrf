package com.nirav.modi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class UserDetailController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/userDetail/{id}")
    public Object getUserDetails(@PathVariable("id") String id) {

        return "{'name':'User-" + id + "','id':'" + id + "'}";
    }

    @GetMapping("/userAddress/{id}")
    public Object getUserAddress(@PathVariable("id") String id) {

        return "{'address':'Ahmedabad, India','id':'" + id + "'}";
    }
}
