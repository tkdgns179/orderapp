package com.example.orderapp.dto;

import com.example.orderapp.domain.Shop;
import lombok.Data;

@Data
public class SignUpDto {


    public Shop getShopEntity() {

        Shop shopEntity = Shop.builder().build();

        return shopEntity;
    }

}
