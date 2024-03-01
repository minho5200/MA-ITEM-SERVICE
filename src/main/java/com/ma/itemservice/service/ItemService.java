package com.ma.itemservice.service;

import com.ma.itemservice.repository.ItemInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemInfoRepository itemInfoRepo;
}
