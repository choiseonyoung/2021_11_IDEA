package com.csy.student.service.impl;

import com.csy.student.models.StudentVO;
import com.csy.student.repository.StudentDao;
import com.csy.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stServiceV1")
public class StudentServiceImplV1 implements StudentService {

    private final StudentDao stDao;

    /**
     * (( AutoWired 쓰지 않고 ))
     * 생성자 주입으로 StudentDao 를 와이어링 하기
     * (( 생성자 주입으로 하면 )) 메모리 누수 방지,
     * 혹시나 발생할 수 있는 null point exception 을 아예 방지할 수 있다
     */
    public StudentServiceImplV1(StudentDao stDao) {
        this.stDao = stDao;
    }

    @Override
    public List<StudentVO> selectAll() {
        return stDao.findAll();
    }

    @Override
    public StudentVO findById(String st_num) {
        /**
         * findById 는 optional type 으로 데이터가 추출되므로 get() method 를 한번 통과 해줘야 한다
         */
        return stDao.findById(st_num).get();
    }

    @Override
    public void insert(StudentVO stVO) {
        stDao.save(stVO);
    }

    @Override
    public void update(StudentVO stVO) {
        stDao.save(stVO);
    }

    @Override
    public void delete(String st_num) {
        stDao.deleteById(st_num);
    }

    /**
     * 학생 정보를 추가(새로등록)할 때
     * 학번을 자동으로 생성하여 학생 model 객체를 생성한 후
     * Controller 에서 write.jsp 로 보내기
     */
    @Override
    public StudentVO insert() {

        StudentVO stVO = StudentVO.builder()
                .st_num("20170271")
                .build();

        return stVO;
    }
}
