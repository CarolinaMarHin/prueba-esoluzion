package com.example.modelo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class PricesDto {

    private int product_id;
    private int brand_id;
    private double price;
    private Date dateApplication;
    private int price_list;

}
