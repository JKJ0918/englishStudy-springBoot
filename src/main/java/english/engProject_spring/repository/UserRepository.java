package english.engProject_spring.repository;

import english.engProject_spring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {


    UserEntity findByEmail(String email); // 이메일로 회원가입 유무 확인.

}
