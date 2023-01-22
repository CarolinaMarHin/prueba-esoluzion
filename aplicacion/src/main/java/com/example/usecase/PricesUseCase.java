package com.example.usecase;

import com.example.modelo.dao.PricesDao;
import com.example.modelo.model.PricesDto;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class PricesUseCase {

    private final PricesDao pricesDao;

    public PricesUseCase(PricesDao pricesDao) {
        this.pricesDao = pricesDao;
    }

    public PricesDto getPriceProduct(String dateApplication, String timeApplication, int product_id, int brand_id) throws ParseException {
        String dateTimeApplicacion = dateApplication.concat(" ").concat(timeApplication);
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date dateApp = new Date(formatter.parse(dateTimeApplicacion).getTime());

        return this.pricesDao.getPriceProduct(dateApp, product_id, brand_id);
    }
}
