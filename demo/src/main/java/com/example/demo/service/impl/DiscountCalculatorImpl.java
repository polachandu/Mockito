package com.example.demo.service.impl;

import com.example.demo.entity.CustomerProfile;
import com.example.demo.entity.ItemSku;
import com.example.demo.service.DiscountCalculator;

public class DiscountCalculatorImpl implements DiscountCalculator {
    @Override
    public double calculateDiscount(ItemSku itemSku, double markedPrice){
        return 0;
    }
    @Override
    public void calculateProfitability(ItemSku itemSku, CustomerProfile customerProfile){

    }
}
