package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSku {
    private int skuCode;
    private double price;
    private double maxDiscount;
    private double margin;
    private int totalQuantity;
    private double applicableDiscount;
}
