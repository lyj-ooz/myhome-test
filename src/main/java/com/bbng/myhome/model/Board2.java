package com.bbng.myhome.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // db 연동을 위한 모델 클래스임을 명시함
@Data // 클래스의 멤버 변수들을 외부에서 사용할 수 있도록 하는 getter, setter 작성해줌
public class Board2 {
    @Id // 아래 id가 pk 임을 알려줌
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String content;
}
