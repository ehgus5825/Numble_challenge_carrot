package com.dohyun.carrotback.item;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcTemplateItemRepository implements ItemRepository {

    // 일반 -------------------------------------------------------------------------------------------

    @Override
    public List<Item> selectItemList(String category, String search, String place) {
        return null;
    }

    @Override
    public ItemView selectItemView(int pid) {
        return null;
    }

    // 회원별  ----------------------------------------------------------------------------------------

    @Override
    public List<Item> selectItemNewListByMember(int mid) {
        return null;
    }

    @Override
    public List<Item> selectItemListByMember(int mid) {
        return null;
    }

    @Override
    public List<Item> selectItemListByMemberAndState(int mid, int State) {
        return null;
    }

    // MY --------------------------------------------------------------------------------------------

    @Override
    public int insertItem(Item item) {
        return 0;
    }

    @Override
    public List<Item> selectMyItemListByState(int mid, int State) {
        return null;
    }

    @Override
    public int updateStateOfMyItem(int pid, int State) {
        return 0;
    }

    @Override
    public int deleteMyItem(int pid) {
        return 0;
    }

    @Override
    public int updateMyItem(int pid, Item item) {
        return 0;
    }

    @Override
    public List<Item> selectMyInterestItemList(int mid) {
        return null;
    }

    @Override
    public List<Item> selectMyInterestItemListByState(int mid) {
        return null;
    }
}
