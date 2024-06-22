package com.example.demo.utils;

import com.example.demo.entity.CustomerProfile;
import com.example.demo.entity.ItemSku;
import com.example.demo.service.DiscountCalculator;
import com.example.demo.service.ItemService;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PriceCalculator {

    public DiscountCalculator discountCalculator;
    public UserService userService;
    public ItemService itemService;

    public double calculatePrice(int itemSkuCode, int customerAcccountId) {
        double price = 0;
        ItemSku sku = itemService.getItemDetail(itemSkuCode);
        CustomerProfile customerProfile = userService.getUser(customerAcccountId);

        double basePrice = sku.getPrice();
        price = basePrice - (basePrice * (sku.getApplicableDiscount()+customerProfile.getExtraLoyaltyDiscountPercentage())/100);
        return price;
    }
}
