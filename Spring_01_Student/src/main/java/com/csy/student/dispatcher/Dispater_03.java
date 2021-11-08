package com.csy.student.dispatcher;

import com.csy.student.controller.StController3;
import com.csy.student.service.impl.StService1;
import com.csy.student.service.impl.StService2;

public class Dispater_03 {

    public static void main(String[] args) {

        StService1 stService = new StService2();
        StController3 stCon = new StController3(stService);
        stCon.list();

    }
}