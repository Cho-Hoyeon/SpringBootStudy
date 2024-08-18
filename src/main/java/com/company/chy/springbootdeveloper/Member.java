package com.company.chy.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@AllArgsConstructor
@Getter
@Entity // 엔티티로 지정
public class Member {
    @Id // 기본키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동 1씩 증가
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="name",nullable = false) // name이라는 not null 컬럼과 매핑
    private String name;

    public void changeName(String name){
        this.name = name;
    }
}
