package com.csy.jc.repository.sql;

public class CreateTableSQL {
    public static final String create_book_table =
            // * IF NOT EXISTS : DB 에 현재 이 테이블이 없으면 만들어라
            "CREATE TABLE IF NOT EXISTS tbl_naver_books (" +
            "   isbn VARCHAR(13) PRIMARY KEY," +
            "    title VARCHAR(125)," +
            "    link VARCHAR(125)," +
            "    image VARCHAR(125)," +
            "    author VARCHAR(125)," +
            "    price VARCHAR(125)," +
            "    discount VARCHAR(125)," +
            "    publisher VARCHAR(125)," +
            "    description VARCHAR(225)," +
            "    pubdate VARCHAR(125) )";
}
