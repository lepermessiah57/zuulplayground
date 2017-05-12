package com.carfax.dt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FooController {

    @RequestMapping(value = "/foo")
    public String foo(){
        System.out.println("foo");
        return "foo";
    }

    @RequestMapping(value = "/foo/{id}")
    public String foo(@PathVariable int id) throws Exception {
        if(id % 2 == 0){
            throw new FourOhFourException();
        }
        return "foo " + id;
    }
}
