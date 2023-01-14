package com.dohyun.carrotback.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private int id;
    private int cid;
    private String from;
    private String to;
    private String content;
    private Date time;
}
