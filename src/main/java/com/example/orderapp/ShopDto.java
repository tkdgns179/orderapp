package com.example.orderapp;

import com.example.orderapp.domain.Shop;
import lombok.Data;
import org.hibernate.usertype.UserType;

@Data
public class ShopDto {
    private String address;
    private String shopName;

    public Shop getShopEntity() {
        return Shop.builder()
            .address(this.address)
            .shopName(this.shopName)
            .build();
    }
}
