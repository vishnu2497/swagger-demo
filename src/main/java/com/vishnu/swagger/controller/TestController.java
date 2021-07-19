package com.vishnu.swagger.controller;

import com.vishnu.swagger.model.TestSchema;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/test")
    void test() {
        System.out.println("it is in the test method");
    }

    @GetMapping("/test1")
    void test1(@RequestParam("abc") String abc) {
        System.out.println("it is in the test method" + abc);
    }

    @GetMapping("/test2/{id}")
    void test2(@PathVariable("id") String abc) {
        System.out.println("it is in the test method" + abc);
    }

    @PostMapping("/test2")
    void testSchema(TestSchema schema) {
        System.out.println("it is in the test method" + schema);
    }
}
