package com.vtb.demobootvtb.controllers;

import com.vtb.vtbstarter.ConditionOnProd;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@Profile("DEV")
public class VtbController {
//
    @GetMapping("/hello")
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





