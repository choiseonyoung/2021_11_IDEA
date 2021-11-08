package com.csy.student.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class OracleVO {

    /**
     * ORACLE DBMS 에서 일련번호 컬럼 만들기
     * (( 오라클일 경우에 seq 를 자동으로 만들지 말고 ))
     * SEQ_ORACLE 이라는 이름으로 Sequence 를 만들고 증가값을 1씩 증가시켜라
     * 이 프로젝트에서 O_SEQ 라는 별명으로 사용하겠다
     */
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="O_SEQ")
    /**
     * O_SEQ 라는 별명으로 생성된 Sequence 를 사용하여
     * insert 할 때 o_seq 컬럼의 데이터를 생성하라
     */
    @SequenceGenerator(name="O_SEQ", sequenceName = "SEQ_ORACLE", allocationSize = 1)
    @Id
    private Long o_seq;
}
