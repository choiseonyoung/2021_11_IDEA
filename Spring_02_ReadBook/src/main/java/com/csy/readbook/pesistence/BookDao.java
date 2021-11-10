package com.csy.readbook.pesistence;

import com.csy.readbook.model.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<BookVO, String> {

}
