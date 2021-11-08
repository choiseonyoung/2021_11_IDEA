package com.csy.student.service;

import com.csy.student.models.StudentVO;

public interface StudentService extends GenericService<StudentVO, String> {
// * 제네릭으로 설정돼있는 메서드들은 자동으로 생성됨

    public StudentVO insert();
}
