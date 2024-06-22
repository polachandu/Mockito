package com.example.demo.service;

import com.example.demo.entity.CustomerProfile;
import com.example.demo.entity.ItemSku;

public interface DiscountCalculator {
    double calculateDiscount(ItemSku itemSku, double markedPrice);
    void calculateProfitability(ItemSku itemSku, CustomerProfile customerProfile);
}
