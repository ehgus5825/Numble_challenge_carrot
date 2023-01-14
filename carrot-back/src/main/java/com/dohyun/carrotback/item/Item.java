package com.dohyun.carrotback.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Item {
    private int id;
    private String title;
    private String content;
    private Date regDate;
    private int price;
    private String category;
    private int interest;
    private String mid;
    private String state;
}
