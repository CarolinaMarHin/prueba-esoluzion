package com.example.ecommerce.controller;

import com.example.modelo.model.PricesDto;
import com.example.usecase.PricesUseCase;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/getFinalPrice")
public class ECommerceController {

    private final PricesUseCase pricesUseCase;

    public ECommerceController(PricesUseCase pricesUseCase) {
        this.pricesUseCase = pricesUseCase;
    }


    @GetMapping(value="/{dateApplication}/{timeApplication}/{product_id}/{brand_id}")
    public PricesDto getFinalPrice(@PathVariable(name = "dateApplication") String dateApplication,
                                   @PathVariable(name = "timeApplication") String timeApplication, @PathVariable(name = "product_id") int product_id,
                                   @PathVariable(name = "brand_id") int brand_id) throws ParseException {

        String dateTimeApplicacion = dateApplication.concat(" ").concat(timeApplication);

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date dateApp = new Date(formatter.parse(dateTimeApplicacion).getTime());
        return this.pricesUseCase.getPriceProduct(dateApp, product_id, brand_id);
    }

}
