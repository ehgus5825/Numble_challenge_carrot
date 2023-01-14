package com.dohyun.carrotback.image;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Image {
    private int id;
    private int pid;
    private String name;
    private String url;
}
