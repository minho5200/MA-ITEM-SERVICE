package com.ma.itemservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@Entity
@Table(name = "order_info")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seqno;

    private String orderNo;

    private String userId;

    private String userName;

    private String itemNo;

    private Integer itemPrice;

    private Integer itemCount;

    private LocalDateTime instDate;

    private String recipientNo;

    private String deliveryAddress;

}
