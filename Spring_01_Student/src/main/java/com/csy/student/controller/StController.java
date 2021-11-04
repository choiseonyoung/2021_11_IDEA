package com.csy.student.controller;

import com.csy.student.model.StudentVO;
import com.csy.student.service.StService;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StController {

    private StService stService = new StService();

    public void list() {
        List<StudentVO> stList = stService.selectAll();
        for(StudentVO vo : stList) {
            log.debug(vo.toString());
        }
    }
}
