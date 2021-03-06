package com.csy.jc.service;

import com.csy.jc.models.BookVO;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public abstract class NaverService<T> {

    public final String NAVER_BOOK_URL = "https://openapi.naver.com/v1/search/book.json";

    // 필수적으로 생성할 method
    public String queryString(String search) throws UnsupportedEncodingException {
        String searchUTF8 = URLEncoder.encode(search,"UTF-8");
        StringBuilder queryURL = new StringBuilder();
        queryURL.append(NAVER_BOOK_URL);
        queryURL.append(String.format("?query=%s",searchUTF8));
        return queryURL.toString();
    }
    // * 이건 그대로 쓰고 아래 두개만 만들어서 써라

    // 선택적으로 사용할 method
    public abstract String getJsonString(String queryString) throws IOException;
    // * queryString 이용해 json String 만듦
    public abstract List<T> naverList(String queryString);
}
