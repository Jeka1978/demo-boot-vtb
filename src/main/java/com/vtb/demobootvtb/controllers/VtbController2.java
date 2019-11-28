package com.vtb.demobootvtb.controllers;

import com.vtb.vtbstarter.FrontendController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@FrontendController
public class VtbController2 {
//
    @GetMapping("/hello2")
    public Person hi() {
        return new Person("Vasiliy");
    }
//
//    @GetMapping("/hello2/{name}")
//    public String hi(@PathVariable String name) {
//
//    }



//    @PostMapping("/person")
//    public String processPerson(@RequestBody Person person) {
//
//    }
}





