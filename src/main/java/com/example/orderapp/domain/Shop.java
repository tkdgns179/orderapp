package com.example.orderapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SHOP_ORDER")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shop extends BaseTimeEntity {
    @Id
    @Column(name = "shop_id")
    private Long id;

    @Column(name = "shop_address")
    private String address;

    //TODO 이벤트 테이블 FK 할인가, 이벤트기간..

    @Column(name = "shop_name")
    private String shopName;

    //TODO 주문 리스트 주문한 손님, 주문 총가격, 주문한 메뉴이름과 갯수

    //TODO 메뉴 리스트 주문 "가능"한 메뉴,.
}
