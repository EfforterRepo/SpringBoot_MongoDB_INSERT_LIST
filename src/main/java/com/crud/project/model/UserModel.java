package com.crud.project.model;

import org.springframework.web.bind.annotation.ModelAttribute;

import lombok.Getter;
import lombok.Setter;

/*
@Getter / @Setter
View -> Controller로 데이터를 보낼 때
@ModelAttribute로 값을 주고받기 편하기 위해 만든 모델
*/

@Setter
@Getter
public class UserModel {
	private String id;
	private String name;
	private String address;
}
