package com.csy.sec.service.impl;

import com.csy.sec.models.UserDetailsVO;
import com.csy.sec.repository.MemberDao;
import com.csy.sec.service.MemberService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("memServiceV1")
public class MemberServiceImplV1 implements MemberService {
    
    private final MemberDao memDao;
    /**
     * security-context.xml 에 선언된 bean 을 가져와서
     * 와이어드 하여 사용할 준비하기
     * 
     * bean 으로 이미 선언이 되었기 때문에
     * final 로 선언하고 생성자에서 주입받기
     */
    private final PasswordEncoder passwordEncoder;

    // * 알트+insert - constructor 생성자 만들어주기
    public MemberServiceImplV1(MemberDao memDao, PasswordEncoder passwordEncoder) {
        this.memDao = memDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<UserDetailsVO> selectAll() {
        List<UserDetailsVO> memberList = memDao.findAll();
        return memberList;
    }

    @Override
    public UserDetailsVO findById(String username) {
        /**
         * JpaRepository 에 선언된 findById(PK) 는
         * SELECT * FROM [table] WHERE PK = [pk] SQL 을 실행하고
         * 결과를 Optional<UserDetailsVO> type 으로 return 을 한다
         * Optional 로 감싸진 데이터는 null safe type 의 데이터이다
         * null 값으로 뭔가를 검사하려고 하면 문제가 되기도 한다
         * 
         * 결과값.orElse(리턴값) method 를 사용하여 결과값이 실제로 null 이면 orElse(리턴값)을 참조하여
         * 그 값을 연산 결과로 return 해준다
         * 
         * 이러한 원리를 이욯하여
         * findById() 한 결과가 없으면 null 값을 return 하도록 만들어준다
         */
        UserDetailsVO userVO = memDao.findById(username).orElse(null );
        return userVO;
    }

    @Override
    public void insert(UserDetailsVO userVO) {
        // * userVO = 회원가입 form 에서 넘겨온 데이터

        // * 이 코드가 핵심
        /**
         * Spring security 에서 제공하는 PasswordEncoder(*이건 interface고 실제로 작동하는 건 BCryptPasswordEncoder가 클래스) 를 사용하여 사용자의 비밀번호 암호화 하기
         */
        String encPassword = passwordEncoder.encode(userVO.getPassword());

        UserDetailsVO saveVO = userVO.builder()
                .username(userVO.getUsername())
                .password(encPassword)
                .isAccountNonExpired(true)
                .isEnabled(true)
                .isCredentialsNonExpired(true)
                .isAccountNonLocked(true)
                .build();
         memDao.save(saveVO);
    }

    @Override
    public void update(UserDetailsVO userDetailsVO) {

    }

    @Override
    public void delete(String s) {

    }

    @Override
    public List<UserDetailsVO> findByEmail(String email) {
        return null;
    }

    @Override
    public List<UserDetailsVO> findByTel(String tel) {
        return null;
    }

    @Override
    public int userCount() {
        return 0;
    }
}
