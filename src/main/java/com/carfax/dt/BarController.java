package com.carfax.dt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

    @RequestMapping(value = "/bar")
    public String bar(){
        return "bar";
    }

    @RequestMapping(value = "/bar/{id}")
    public String bar(@PathVariable int id){
        return "bar " + id;
    }
}
