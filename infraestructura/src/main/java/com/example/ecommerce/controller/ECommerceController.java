package com.example.ecommerce.controller;

import com.example.modelo.model.PricesDto;
import com.example.usecase.PricesUseCase;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/getFinalPrice")
public class ECommerceController {

    //@Autowired
    private final PricesUseCase pricesUseCase;

    public ECommerceController(PricesUseCase pricesUseCase) {
        this.pricesUseCase = pricesUseCase;
    }


    @GetMapping(value="/{dateApplication}/{product_id}/{brand_id}")
    public PricesDto getFinalPrice(@PathVariable(name = "dateApplication")  @DateTimeFormat(pattern= "yyyy-MM-dd") Date dateApplication, @PathVariable(name = "product_id") int product_id, @PathVariable(name = "brand_id") int brand_id) {
        return this.pricesUseCase.getPriceProduct(dateApplication, product_id, brand_id);
    }

}
