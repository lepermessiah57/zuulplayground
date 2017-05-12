package com.carfax.dt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FooController {

    @RequestMapping(value = "/foo")
    public String foo(@RequestParam(required = false) Integer id) throws Exception {
        System.out.println("foo " + id);
        if(id != null && id % 2 == 0){
            throw new FourOhFourException("",404,"");
        }
        return "foo " + id;
    }
}
