package com.csy.student.controller;

import com.csy.student.model.StudentVO;
import com.csy.student.service.impl.StService1;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class StController3 {

    // 인터페이스로 선언만 하기
    private final StService1 stService ;
    public StController3(StService1 stService) {
        this.stService = stService;
    }

    public void list() {
        List<StudentVO> stList = stService.selectAll();
        for(StudentVO vo : stList) {
            log.debug(vo.toString());
        }
    }
}