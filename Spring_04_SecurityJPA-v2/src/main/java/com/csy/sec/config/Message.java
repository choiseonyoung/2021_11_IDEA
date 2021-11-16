package com.csy.sec.config;

import org.springframework.security.authentication.*;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;

// * 로그인 했을 때 어떤 오류 발생했을 때 보여줄 메시지 메서드
public class Message {
    public static class ERROR {

        // 대표 exception
        public final static String BadCredentialsException
                = "아이디나 비밀번호가 맞지 않습니다. 다시 확인해 주세요";
        
        public final static String Disabled
                = "계정이 비활성화 되었습니다. 관리자에게 문의하세요";
        // * Disabled 속성 있던 거 false 일 때 발생하는 exception
        
        public final static String CredentialsExpired
                = "비밀번호 유효기간이 만료되었습니다. 비밀번호를 변경해 주세요";
        
        public final static String Locked
                = "계정이 잠겨 있습니다. 관리자에게 문의하세요";

        public final static String AccountExpired
                = "계정 사용기간이 만료되었습니다. 관리자에게 문의하세요";

        public final static String SessionAuthentication
                = "인증 세션에 문제가 있습니다. 관리자에게 문의하세요";
    }
}
