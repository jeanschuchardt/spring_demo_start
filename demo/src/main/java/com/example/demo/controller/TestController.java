package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	    /*TODO::*/
	    @RequestMapping(value="/test", method = RequestMethod.GET)
	    public ResponseEntity<String> test(){
	        return new ResponseEntity<>("ok_Test", HttpStatus.OK);
	    }
	
}
