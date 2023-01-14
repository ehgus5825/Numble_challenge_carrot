package com.dohyun.carrotback.item;

import org.springframework.web.bind.annotation.GetMapping;

public interface ItemController {

    // 상품 목록(홈) - get
    String list();

    // 상품 검색 + 카테고리 - get
    String search();

    // 상품 검색 + 카테고리 - post
    String searchPost();

    // 상품 등록 (카테고리 모달) - get
    String create();

    // 상품 등록 (카테고리 모달) - post
    String createPost();

    // 상품 조회 - get
    String element();

    // 특정 회원 상품 목록 - (전체)
    String allListByMember();

    // 특정 회원 상품 목록 - (판매중)
    String sellingListListByMember();

    // 특정 회원 상품 목록 - (거래완료)
    String memberItemListEnd();

    // 내 상품 조회 (판매 내역 조회)
    String detailMyItem();

    // 상품 수정 (판매 내역 수정)
    String changeItem();

    // 상품 거래 여부 수정 (판매 내역 조회)
    String changeStateOfItem();

    // 상품 삭제 (판매 내역 조회)
    String dropItem();

    // 상품 거래 여부 수정 (판매 내역 목록)
    String changeStateOfItemList();

    // 내 상품 목록 (판매 내역 목록) - 판매중
    String myItemListSelling();

    // 내 상품 목록 (판매 내역 목록) - 거래완료
    String myItemListEnd();

    // 관심 상품 목록 (전체)
    String InterestItemListAll();

    // 관심 상품 목록 (판매중)
    String InterestItemListSelling();

    // 관심 상품 목록 (거래 완료)
    String InterestItemListEnd();
}
