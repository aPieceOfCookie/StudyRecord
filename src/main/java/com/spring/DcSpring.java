package com.spring;


import com.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class DcSpring {

    @Resource
    private Integer num;

    public ModelAndView demo(Model model){
        ModelAndView modelAndView = new ModelAndView();
        Map<Integer,Integer> numMap=new HashMap<>();
        modelAndView.addObject(numMap);
        return modelAndView;
    }

    public ResponseEntity<Student> login(){
        Student student=new Student();
        return new ResponseEntity("你好",HttpStatus.IM_USED);
    }
}
