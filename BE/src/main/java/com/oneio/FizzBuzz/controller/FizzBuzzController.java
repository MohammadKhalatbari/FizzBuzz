package com.oneio.FizzBuzz.controller;

import com.oneio.FizzBuzz.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("FizzBuzz")
@CrossOrigin(origins = "*")
public class FizzBuzzController {

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @GetMapping("Start/{number}")
    public ResponseEntity<String> getInputNumber(@PathVariable("number") short number) {
//        Check input number validation
        if (number > 0) {
            return new ResponseEntity<>(fizzBuzzService.getFizzBuzzResult(number), HttpStatus.OK);
        } else {
//            Send an error message
            String errorMessage = "Please enter valid Number. It should be bigger than zero.";
            return new ResponseEntity<>(errorMessage, HttpStatus.OK);
        }
    }
}