package com.ma.itemservice.service;

import com.ma.itemservice.repository.OrderInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderInfoRepository orderInfoRepo;

}
