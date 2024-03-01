package com.ma.itemservice.repository;

import com.ma.itemservice.entity.ItemInfo;
import com.ma.itemservice.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

}
