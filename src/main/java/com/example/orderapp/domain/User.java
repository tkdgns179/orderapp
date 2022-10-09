package com.example.orderapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Table(name = "ORDER_USER")
public class User extends BaseTimeEntity {

    @Id
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_name", length = 10, nullable = false)
    private String userName;

    @Column(name = "user_nickname", length = 20, nullable = false)
    private String userNickname;

    @Column(name = "user_password", length = 20, nullable = false)
    private String userPassword;

    //TODO 주문번호 FK키 number - order_id

    @Column(name = "user_address", length = 50, nullable = false)
    private String userAddress;

    @Enumerated
    @Column(name = "user_type", nullable = false)
    private UserType userType;

    @Getter
    @AllArgsConstructor
    enum UserType {
        Customer("손님"),
        Store("점포");

        private String typeName;
    }
}

