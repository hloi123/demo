package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value ="demo/{number}", produces ="application/json")
    public ResponseEntity<String> getData(@PathVariable Integer number) {
        if (number < 0) {
            return new ResponseEntity<>("number should be positive!", HttpStatus.CONFLICT);
        }
        return new ResponseEntity(getLastFibonacci(number).toString(), HttpStatus.OK);
    }

    public Integer getLastFibonacci(Integer n) {
        if (n <= 1) {
            return n;
        }
        // Recursive case: sum of the two preceding
        // Fibonacci numbers
        return getLastFibonacci(n - 1) + getLastFibonacci(n - 2);
    }

}