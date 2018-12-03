package com.atmoon.spring.customer.dao;

import com.atmoon.spring.customer.model.Customer;

public interface CustomerDao {

    public void insert(Customer customer);

    public Customer findCustomerById(int custId);
}
