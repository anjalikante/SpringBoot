package com.example.Reputation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping(value = "/test")
    public  String test()
    {
        System.out.println();
        return  "hello";
    }
}
