package com.ma.itemservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_info")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seqno;

    private String userId;

    private String email;

    private String nickName;

    private String userName;

    private String password;

    private String address;

    private LocalDateTime instDate;

    private String phoneNo;

}
