package com.csy.jc.repository;

import org.apache.ibatis.annotations.Select;

public interface DDL_Dao {

    @Select(" ${create_table} ")
    // * 매개변수로 받은 문자열에 들어있는 명령문을 풀어서 써라
    public void create_table(String create_table);
}
