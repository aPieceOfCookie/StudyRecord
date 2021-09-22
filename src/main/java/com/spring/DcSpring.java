package com.spring;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

public class DcSpring {
    public ModelAndView demo(Model model){
        ModelAndView modelAndView = new ModelAndView();
        Map<Integer,Integer> numMap=new HashMap<>();
        modelAndView.addObject(numMap);
        return modelAndView;
    }
}
