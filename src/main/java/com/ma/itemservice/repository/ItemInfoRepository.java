package com.ma.itemservice.repository;

import com.ma.itemservice.entity.ItemInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemInfoRepository extends JpaRepository<ItemInfo, Integer> {

}
