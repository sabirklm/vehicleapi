package com.fleur.vehicleapi.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {

    @GetMapping("/id")
    public HashMap<String, String> getUser() {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("name", "Sabir Mondal");
        data.put("id", "yfcvjucgjvhbythgn");

        return data;
    }



}
