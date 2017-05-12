package com.carfax.dt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

    @RequestMapping(value = "/bar")
    public String bar(@RequestParam(required = false) Integer id){
        return "bar " + id;
    }
}
