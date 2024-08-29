package com.muckjido.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CouponStatus {
    UNUSED("미사용"),
    USED("사용완료"),
    EXPIRED("기간만료");
    private final String description;
}
