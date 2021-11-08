package com.csy.student.dispatcher;

import com.csy.student.controller.StController2;
import com.csy.student.service.impl.StService1;
import com.csy.student.service.impl.StService2;

public class Dispater_02 {

    public static void main(String[] args) {

        StController2 stCon = new StController2();
        StService1 stService = new StService2();
        stCon.setStService(stService);
        stCon.list();
    }
}