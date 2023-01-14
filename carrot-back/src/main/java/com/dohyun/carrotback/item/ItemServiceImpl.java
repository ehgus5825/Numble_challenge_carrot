package com.dohyun.carrotback.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    // 일반 -------------------------------------------------------------------------------------------

    @Override
    public List<Item> getItemList(String category, String search, String place) {
        return itemRepository.selectItemList(category, search, place);
    }

    @Override
    public ItemView getItemView(int pid) {
        return itemRepository.selectItemView(pid);
    }

    // 회원별  ----------------------------------------------------------------------------------------

    @Override
    public List<Item> getItemNewListByMember(int mid) {
        return itemRepository.selectItemNewListByMember(mid);
    }

    @Override
    public List<Item> getItemListByMember(int mid) {
        return itemRepository.selectItemListByMember(mid);
    }

    @Override
    public List<Item> getItemListByMemberAndState(int mid, int state) {
        return itemRepository.selectItemListByMemberAndState(mid, state);
    }

    // MY --------------------------------------------------------------------------------------------

    @Override
    public int regItem(Item item) {
        return itemRepository.insertItem(item);
    }

    @Override
    public List<Item> getMyItemListByState(int mid, int state) {
        return itemRepository.selectMyItemListByState(mid, state);
    }

    @Override
    public int setStateOfMyItem(int pid, int state) {
        return itemRepository.updateStateOfMyItem(pid, state);
    }

    @Override
    public int removeMyItem(int pid) {
        return itemRepository.deleteMyItem(pid);
    }

    @Override
    public int setMyItem(int pid, Item item) {
        return itemRepository.updateMyItem(pid, item);
    }

    @Override
    public List<Item> getMyInterestItemList(int mid) {
        return itemRepository.selectMyInterestItemList(mid);
    }

    @Override
    public List<Item> getMyInterestItemListByState(int mid) {
        return itemRepository.selectMyInterestItemListByState(mid);
    }
}
