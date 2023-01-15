package com.dohyun.carrotback.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    // 상품 목록(홈) - get
    String list(){
        return null;
    }

    // 상품 검색 + 카테고리 - get
    String search(){
        return null;
    }

    // 상품 검색 + 카테고리 - post
    String searchPost(){
        return null;
    }

    // 상품 등록 (카테고리 모달) - get
    String create(){
        return null;
    }

    // 상품 등록 (카테고리 모달) - post
    String createPost(){
        return null;
    }

    // 상품 조회 - get
    String element(){
        return null;
    }

    // 특정 회원 상품 목록 - (전체)
    String allListByMember(){
        return null;
    }

    // 특정 회원 상품 목록 - (판매중)
    String sellingListListByMember(){
        return null;
    }

    // 특정 회원 상품 목록 - (거래완료)
    String memberItemListEnd(){
        return null;
    }

    // 내 상품 조회 (판매 내역 조회)
    String detailMyItem(){
        return null;
    }

    // 상품 수정 (판매 내역 수정)
    String changeItem(){
        return null;
    }

    // 상품 거래 여부 수정 (판매 내역 조회)
    String changeStateOfItem(){
        return null;
    }

    // 상품 삭제 (판매 내역 조회)
    String dropItem(){
        return null;
    }

    // 상품 거래 여부 수정 (판매 내역 목록)
    String changeStateOfItemList(){
        return null;
    }

    // 내 상품 목록 (판매 내역 목록) - 판매중
    String myItemListSelling(){
        return null;
    }

    // 내 상품 목록 (판매 내역 목록) - 거래완료
    String myItemListEnd(){
        return null;
    }

    // 관심 상품 목록 (전체)
    String InterestItemListAll(){
        return null;
    }

    // 관심 상품 목록 (판매중)
    String InterestItemListSelling(){
        return null;
    }

    // 관심 상품 목록 (거래 완료)
    String InterestItemListEnd(){
        return null;
    }

}
