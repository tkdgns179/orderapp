package com.example.orderapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserType {
    customer("손님"),
    store("점포");

    private final String typeName;
}
