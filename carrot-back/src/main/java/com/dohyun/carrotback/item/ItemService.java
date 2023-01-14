package com.dohyun.carrotback.item;

import java.util.List;

public interface ItemService {

    // item : 상품 id(pk), 제목, 본문, 게시일자(default),
    //        가격, 카테고리, 관심(default(0)), 회원 id(fk), 장소(회원), 거래상태(default(0)), 이미지(null)

    // 일반 -------------------------------------------------------------------------------------------
    
    // 카테고리, 검색어, 장소로 상품 목록 조회
    // - 이미지, 제목, 장소, 가격, 관심 수 조회
    // - 관심 수가 0이면 관심 표시를 하지 않음
    List<Item> getItemList(String category, String search, String place);

    // 상품 상세 조회
    // - 이미지, 회원(닉네임, 사진 - join), 장소, 제목, 가격, 카테고리, 게시시간, 본문, 관심 수 조회
    ItemView getItemView(int pid);

    // 회원별  ----------------------------------------------------------------------------------------
    
    // 회원별 최근 상품 목록 (4개)
    // - 이미지, 제목, 가격 조회
    List<Item> getItemNewListByMember(int mid);

    // 회원별 상품 목록 (전체)
    // - 이미지, 제목, 장소, 가격, 관심 수, 거래여부 조회
    // - 거래 완료일때만 거래 완료 표시
    // - 관심 수 0이라면 표시하지 않음
    List<Item> getItemListByMember(int mid);

    // 거래 여부에 따른 회원별 상품 목록 (판매중/거래완료) 
    // - 이미지, 제목, 장소, 가격, 관심 수, 거래여부 조회
    // - 거래 완료일때만 거래 완료 표시
    // - 관심 수 0이라면 표시하지 않음
    List<Item> getItemListByMemberAndState(int mid, int state);

    // MY --------------------------------------------------------------------------------------------

    // 상품 등록 
    // - 제목, 카테고리, 가격, 이미지(선택), 본문, (회원 ID), 장소(회원) 등록
    int regItem(Item item);

    // 예약중은 또 뭐임?

    // 판매 내역 (거래 여부 / 내 상품 목록)
    // - 이미지, 제목, 장소, 가격, 관심 수 조회
    // - 관심 수 0이라면 표시하지 않음
    List<Item> getMyItemListByState(int mid, int state);

    // 상품 거래 상태 수정
    // - 상품 id와 거래 상태를 받아서 수정
    int setStateOfMyItem(int pid, int state);

    // 상품 삭제
    // - 상품 id를 받아서 삭제
    int removeMyItem(int pid);

    // 상품 수정
    // - 상품 id와 item을 가지고 변경
    int setMyItem(int pid, Item item);
    
    // 관심 있는 상품 목록 (전체)
    // - 이미지, 제목, 장소, 가격, 관심 수, 거래 여부 조회
    // - 거래완료는 거래완료시에만 표시
    List<Item> getMyInterestItemList(int mid);

    // 거래여부에 따른 관심 있는 상품 목록 (판매중/거래완료)
    // - 이미지, 제목, 장소, 가격, 관심 수, 거래 여부 조회
    // - 거래완료는 거래완료시에만 표시
    List<Item> getMyInterestItemListByState(int mid);
}
