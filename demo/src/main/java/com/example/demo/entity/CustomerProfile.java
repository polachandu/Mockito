package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerProfile {
    private String customerName;
    private String loyaltyTier;
    private String customerAddress;
    private String accountId;
    private double extraLoyaltyDiscountPercentage;
}
