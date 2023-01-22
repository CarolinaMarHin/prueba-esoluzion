package com.example.ecommerce.adaptador.dao;

import com.example.modelo.model.PricesDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PricesMapper implements RowMapper<PricesDto> {

    @Override
    public PricesDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        int product_id = resultSet.getInt("product_id");
        int brand_id = resultSet.getInt("brand_id");
        double price = resultSet.getDouble("price");
        Date dateApplication = new Date();
        int price_list = resultSet.getInt("price_list");

        return new PricesDto(product_id, brand_id, price, dateApplication, price_list);
    }

}
