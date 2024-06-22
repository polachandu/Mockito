package com.example.demo.utilTests;

import com.example.demo.entity.CustomerProfile;
import com.example.demo.entity.ItemSku;
import com.example.demo.service.DiscountCalculator;
import com.example.demo.service.ItemService;
import com.example.demo.service.UserService;
import com.example.demo.utils.PriceCalculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@Slf4j
public class PriceCalculatorTests {

    @InjectMocks private PriceCalculator priceCalculator;

    @Mock private DiscountCalculator discountCalculator;

    @Mock private UserService userService;

    @Mock private ItemService itemService;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculatePrice_withCorrectInput_returnExpectedResult() {
        ItemSku itemSku = new ItemSku();
        itemSku.setApplicableDiscount(5.00);
        itemSku.setPrice(100.00);

        CustomerProfile customerProfile = new CustomerProfile();
        customerProfile.setExtraLoyaltyDiscountPercentage(2.00);

        double expectedPrice = 93.00;

        when(itemService.getItemDetail(anyInt())).thenReturn(itemSku);
        when(userService.getUser(anyInt())).thenReturn(customerProfile);

        double actualPrice = priceCalculator.calculatePrice(123,5432);
        log.info("expectedPrice={}, actualPrice={}", expectedPrice, actualPrice);
        assertEquals(expectedPrice, actualPrice);
    }
}
