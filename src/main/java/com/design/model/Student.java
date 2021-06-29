package com.design.model;

import lombok.Data;

@Data
public class Student extends DcPerson{
    @Override
    public void eatFood() {
        System.out.println("吃米饭");
    }
}
