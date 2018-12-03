package com.atmoon.spring.customer.RowMapper;

import com.atmoon.spring.customer.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setCustId(resultSet.getInt("CUST_ID"));
        customer.setName(resultSet.getString("NAME"));
        customer.setAge(resultSet.getInt("AGE"));
        return customer;
    }
}
