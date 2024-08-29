package com.muckjido.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {

    admin("관리자"),
    client("고객");

    private final String description;
}
