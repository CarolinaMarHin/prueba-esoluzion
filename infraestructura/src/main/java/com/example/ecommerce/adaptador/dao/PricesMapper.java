package com.example.ecommerce.adaptador.dao;

import com.example.modelo.model.PricesDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PricesMapper implements RowMapper<PricesDto> {

    @Override
    public PricesDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        int product_id = 1;
        int brand_id = 1;
        double price = 1.0;
        Date dateApplication = new Date();
        int price_list = 1;

        return new PricesDto(product_id, brand_id, price, dateApplication, price_list);
    }

}
