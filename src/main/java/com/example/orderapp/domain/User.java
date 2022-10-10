package com.example.orderapp.domain;

import com.example.orderapp.ShopDto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "ORDER_USER")
@NoArgsConstructor
@AllArgsConstructor
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

    @OneToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @Getter
    @AllArgsConstructor
    enum UserType {
        Customer("손님"),
        Store("점포");

        private String typeName;
    }

    private Shop register(ShopDto shopDto) {
        if (userType.getTypeName().equals("손님")) {
            //TODO DTO로 받은 가게정보 넣어서 생성
            return shopDto.getShopEntity();
        }
        else {
            //TODO null 처리할지 계획 중
            return new Shop();
        }
    }
}

