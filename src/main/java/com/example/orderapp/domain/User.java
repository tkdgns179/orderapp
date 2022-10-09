package com.example.orderapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_name", length = 10)
    private String userName;

    @Column(name = "user_nickname", length = 20)
    private String userNickname;

    @Column(name = "user_password", length = 20)
    private String userPassword;

    //TODO 주문번호 FK키 number - order_id

    @Column(name = "user_address", length = 50)
    private String userAddress;

    @Enumerated
    @Column(name = "user_type")
    private String userType;

    @Column(name = "create_date")
    private LocalDate

}
