package com.dohyun.carrotback.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.crypto.Data;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {
    private String id;
    private String email;
    private String pwd;
    private String image;
    private String name;
    private String phone;
    private String nickName;
    private Data joinDate;
    private String address;
}
