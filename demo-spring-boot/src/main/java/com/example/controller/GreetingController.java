package com.example.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@RestController
public class GreetingController{
    @GetMapping("/greeting")
    public ResponseEntity<String> showGreeting() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

//    @RequestMapping("/error")
//    public ResponseEntity<String> handleError(HttpServletRequest request) {
//        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//        if(status != null) {
//            int statusCode = Integer.parseInt(status.toString());
//            if(statusCode == HttpStatus.NOT_FOUND.value()) {
//                return new ResponseEntity<>("404 NOT FOUND", HttpStatus.OK);
//            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//                return new ResponseEntity<>("ERROR 500", HttpStatus.OK);
//            }
//        }
//        return new ResponseEntity<>("Error", HttpStatus.OK);
//    }
}
