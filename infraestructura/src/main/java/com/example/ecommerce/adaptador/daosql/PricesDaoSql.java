package com.example.ecommerce.adaptador.daosql;

import com.example.ecommerce.adaptador.dao.PricesMapper;
import com.example.modelo.dao.PricesDao;
import com.example.modelo.model.PricesDto;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class PricesDaoSql implements PricesDao {
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public PricesDaoSql(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public PricesDto getPriceProduct(Date dateApplication, int product_id, int brand_id) {
        String sqlQuery = "SELECT * FROM PRICES WHERE BRAND_ID = :brand_id " +
                "AND PRODUCT_ID = :product_id " +
                "AND START_DATE<= :dateApplication " +
                "AND END_DATE >= :dateApplication " +
                "ORDER BY PRIORITY DESC LIMIT 1";

        PricesDto pricesDto = namedParameterJdbcTemplate.query(sqlQuery, new PricesMapper()).get(0);
        //pricesDto.get(0).setDateApplication(dateApplication);

        return pricesDto;
    }
}
