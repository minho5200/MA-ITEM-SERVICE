package com.ma.itemservice.service;

import com.ma.itemservice.entity.UserInfo;
import com.ma.itemservice.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserInfoRepository userInfoRepo;

}
