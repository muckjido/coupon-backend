package com.muckjido.coupon.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventStatus {
    WAIT("예정"),
    IN_PROGRESS("발급중"),
    COMPLETED("발급 완료"),
    STOP("중단")
    ;


    private final String description;

}
