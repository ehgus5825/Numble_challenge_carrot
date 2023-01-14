package com.dohyun.carrotback.item;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class ItemView extends Item {

    private String m_file;
    private String m_Nickname;

    public ItemView(int pid, String title, String content, Date regDate, int price, String Category, int interest,
                    String mid, String m_file, String m_Nickname, String m_place, String state, String files) {
        super(pid, title, content, regDate, price, Category, interest, mid, m_place, state, files);
        this.m_file = m_file;
        this.m_Nickname = m_Nickname;
    }
}
