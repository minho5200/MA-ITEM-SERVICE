package com.ma.itemservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "item_info")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seqno;

    private String itemNo;

    private String itemName;

    private Integer itemPrice;

    private Integer itemStock;

    private String itemDesc;

    private LocalDateTime instDate;

}
