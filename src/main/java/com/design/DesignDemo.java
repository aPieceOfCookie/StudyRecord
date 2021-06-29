package com.design;

import com.design.model.DcPerson;

public class DesignDemo {

    /**
     * 简单工厂 <br>
     *  可以参考： <p>工具类java.text.DateFormat</p>
     */
    public void sipleFactory(){
        DcSimpleFactory factory=new DcSimpleFactory();
        DcPerson person=factory.getPerson("student");
    }


}
