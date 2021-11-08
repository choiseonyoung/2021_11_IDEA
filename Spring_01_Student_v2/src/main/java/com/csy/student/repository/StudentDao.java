package com.csy.student.repository;

import com.csy.student.models.StudentVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentVO, String> {


}
