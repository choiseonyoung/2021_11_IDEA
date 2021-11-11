package com.csy.sec.controller.exec;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BCrypt_01 {
    public static void main(String[] args) {

        /**
         * 암호화, 복호화
         *
         * 보안과 관련 용어 중 "인가"
         * username, password 를 입력받아 정상적인 사용자 username password 인지 검사하고 접속을 허가하는 절차
         *
         * 양방향 암호화를 이용한 보안
         * jasypt 를 이용한 암호화 방법
         * 이때 username 은 보통문자열로 구성하지만
         * password 는 가급적 노출되지 않도록 "암호화(encrypt)"를 한다
         *
         * 암호화된 password 를 DB에 저장하고
         * 저장된 암호화된 password 를 다시 "복호화"하여 로그인 정보와 비교한다
         * 
         * 단방향 암호화를 이용한 보안
         * PasswordEncoder(BCryptPasswordEncoder 로 구현)
         * 회원가입을 할 때 비번을 암호화하여 저장하고
         * 
         * 로그인을 할 때
         * DB 에서 회원정보를 SELECT 한 후
         * login 을 통해 전달된 Password 와 비교를 하는데
         * 
         * DB에 저장된 password 를 복호화하지 않고
         * login 을 통해 전달된 Password 를 다시 암호화하여 두 값을 비교한다
         *
         * 즉, 암호화는 하는데 복호화는 불가능한 암호화 기법
         */

        PasswordEncoder pass = new BCryptPasswordEncoder(4);
        String password = "12345";
        // * (아래) 컨트롤+쉬프트+F10 해서 나온 거 넣은 것
        String encPassword = "$2a$04$YsPB6zZN.YT2inOTBtqMwOrE0AzyuubMsCMr8fG9wu4v8jL4305X.";

        String bcPassword = pass.encode(password);
        System.out.println("생성된 문자열 : " + bcPassword);
        System.out.println("문자열의 길이 : " + bcPassword.length());

        // matches(rowPassword, encPassword)
        boolean loginOk = pass.matches(password, encPassword);
        
        if(loginOk) {
            System.out.println("맞음");
        } else {
            System.out.println("틀림");
        }
    }
}
