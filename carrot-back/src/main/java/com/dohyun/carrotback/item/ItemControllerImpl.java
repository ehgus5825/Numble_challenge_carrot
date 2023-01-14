package com.dohyun.carrotback.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ItemControllerImpl  {

    private final ItemService itemService;

}
