package com.example.testgrpctohttp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HTTPRequest {

    @RequestMapping("/send")
    public ModelAndView sendInfo(String message, int intValue, double doubleValue) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("web");
        modelAndView.addObject("message", message);
        modelAndView.addObject("intValue", intValue);
        modelAndView.addObject("doubleValue", doubleValue);
        return modelAndView;
    }
}