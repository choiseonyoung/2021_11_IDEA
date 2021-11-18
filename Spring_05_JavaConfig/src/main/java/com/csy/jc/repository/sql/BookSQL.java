package com.csy.jc.repository.sql;

import org.apache.ibatis.jdbc.SQL;

public class BookSQL {

    /**
     * mybatis mapper 에 주입할 SQL 코드는
     * 반드시 final String 으로 선언해야 한다
     */
    public static final String book_insert_sql
            = " INSERT INTO tbl_naver_books "
            + " ( isbn, title, author, publisher ) "
            + " VALUES( #{isbn}, #{title}, #{author}, #{publisher} )";
    // * 이렇게 문자열로 만든 건 mybatis 오래된 버전에서도 가능

    // * mybatis 3.5.x 이상에서만 사용 가능 (이걸 더 권장)
    public String book_insert() {
        SQL sql = new SQL();
        sql.INSERT_INTO("tbl_naver_books");
        sql.INTO_COLUMNS("isbn").INTO_VALUES("#{isbn}");
        return sql.toString();
    }

    public String book_update_sql() {
        SQL sql = new SQL();
        sql.UPDATE("tbl_naver_books");
        sql.SET("title = #{title}");
        sql.SET("author = #{author}");
        sql.SET("publisher = #{publisher}");
        sql.WHERE("isbn=#{isbn}");
        return sql.toString();
    }
}
