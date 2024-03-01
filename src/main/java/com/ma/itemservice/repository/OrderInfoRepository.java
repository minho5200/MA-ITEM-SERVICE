package com.ma.itemservice.repository;

import com.ma.itemservice.entity.ItemInfo;
import com.ma.itemservice.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer> {

}
