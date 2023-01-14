package com.dohyun.carrotback.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Chat {
    private int id;
    private int from_id;
    private int to_id;
    private int pid;
    private String subject;
    private String status;
    private Date time;
}
