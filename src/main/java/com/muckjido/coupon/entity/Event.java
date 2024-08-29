package com.muckjido.coupon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String eventName;
    private String description;
    private String notice;
    private Integer limitCount;
    private String imgUrl;
    private EventStatus eventStatus;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    private LocalDateTime eventStartDate;
    private LocalDateTime eventEndDate;
    private LocalDateTime couponStartDate;
    private LocalDateTime couponEndDate;




}
