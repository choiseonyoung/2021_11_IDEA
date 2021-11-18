use naraDB;
SHOW tables;
DESC tbl_members;
SELECT * FROM tbl_members;

USE naraDB;
DESC tbl_books;

CREATE TABLE tbl_naver_books (
	isbn VARCHAR(13) PRIMARY KEY,
    title VARCHAR(125),
    link VARCHAR(125),
    image VARCHAR(125),
    author VARCHAR(125),
    price VARCHAR(125),
    discount VARCHAR(125),
    publisher VARCHAR(125),
    description VARCHAR(225),
    pubdate VARCHAR(25)
)