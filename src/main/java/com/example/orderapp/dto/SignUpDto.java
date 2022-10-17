package com.example.orderapp.dto;

import com.example.orderapp.domain.Shop;
import com.example.orderapp.domain.User;
import com.example.orderapp.domain.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpDto {

    private String username;
    private String phoneNumber;
    private String password;
    private String userType;
    private String address;

    public User toUserEntity() {

        User userEntity = User.builder()
            .userAddress(address)
            .phoneNumber(phoneNumber)
            .userPassword(password)
            .userType(UserType.customer)
            .build();

        return userEntity;

    }

}
