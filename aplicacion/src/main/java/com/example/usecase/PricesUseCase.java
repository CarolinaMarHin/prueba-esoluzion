package com.example.usecase;

import com.example.modelo.dao.PricesDao;
import com.example.modelo.model.PricesDto;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PricesUseCase {

    private final PricesDao pricesDao;

    public PricesUseCase(PricesDao pricesDao) {
        this.pricesDao = pricesDao;
    }

    public PricesDto getPriceProduct(Date dateApplication, int product_id, int brand_id) {
        return this.pricesDao.getPriceProduct(dateApplication, product_id, brand_id);
    }
}
