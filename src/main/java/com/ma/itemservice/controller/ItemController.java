package com.ma.itemservice.controller;


import com.ma.itemservice.service.ItemService;
import com.ma.itemservice.service.OrderService;
import com.ma.itemservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
    private final OrderService orderService;
    private final UserService userService;

    //crud

}
