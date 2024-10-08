package com.food.ordering.system.springwork3.cartItem.model.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemMessage {
    private Long userId;
    private List<ProductQuantity> products;
    private String action;
}

