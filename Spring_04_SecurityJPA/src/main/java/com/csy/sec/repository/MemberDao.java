package com.csy.sec.repository;

import com.csy.sec.models.UserDetailsVO;
import org.springframework.data.jpa.repository.JpaRepository;

// * 아무것도 없는 빈 공간만 남겨둠. Jpa~ 사용하게 되면 Dao 에서 할 일이 기본 CRUD 만 구현할 때는 없다
public interface MemberDao extends JpaRepository<UserDetailsVO, String> {

}
