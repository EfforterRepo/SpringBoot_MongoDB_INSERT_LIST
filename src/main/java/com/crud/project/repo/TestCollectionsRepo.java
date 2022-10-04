package com.crud.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.crud.project.entity.TestCollections;

/*
JPA를 사용하기위해 JpaRepository를 상속받는 Repo interface를 만들어야한다.
인터페이스명
- public interface 이름 extends JpaRepository <엔티티 클래스이름 , ID 필드 타입>
JpaRepository<User_table, Integer>
-> User_table 이유 : 첫번째 인자에 "User_table" 이라는 클래스 이름을 적어야 함. 
-> Integer 이유 : @ID를 준 필드가 "private int MEMBER_ID;" 이기 때문


 */


public interface TestCollectionsRepo extends MongoRepository<TestCollections, Long> {
}

