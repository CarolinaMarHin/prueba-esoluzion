package com.example.modelo.dao;

import com.example.modelo.model.PricesDto;

import java.util.Date;

public interface PricesDao {
    PricesDto getPriceProduct(Date dateApplication, int product_id, int brand_id);
}
