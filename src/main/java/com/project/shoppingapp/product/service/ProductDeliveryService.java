package com.project.shoppingapp.product.service;

import com.project.shoppingapp.product.domain.MoneyTypes;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class ProductDeliveryService {

    public String getDeliveryInfo(String productId) {
        // TODO
        return "Tomorrow";
    }

    public boolean freeDeliveryCheck(String productId, BigDecimal price, MoneyTypes moneyType) {
        // TODO
        return true;
    }
}
