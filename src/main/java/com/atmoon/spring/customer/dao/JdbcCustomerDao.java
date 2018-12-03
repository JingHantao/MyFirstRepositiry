package com.atmoon.spring.customer.dao;

import com.atmoon.spring.customer.RowMapper.CustomerRowMapper;
import com.atmoon.spring.customer.model.Customer;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDao extends JdbcDaoSupport implements CustomerDao {

    @Override
    public void insert(Customer customer) {
        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        getJdbcTemplate().update(sql, new Object[] { customer.getCustId(),
                customer.getName(),customer.getAge()
        });
    }

    /**
     * 使用RowMapper查找单条数据
     * @param custId
     * @return
     */

    @Override
    public Customer findCustomerById(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
        Customer customer = (Customer)getJdbcTemplate().queryForObject(
                sql, new Object[] { custId }, new CustomerRowMapper());
        return customer;
    }
}
