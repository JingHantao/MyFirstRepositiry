package com.atmoon.base.test;

import com.atmoon.base.beans.Student;
import com.atmoon.spring.customer.dao.CustomerDao;
import com.atmoon.spring.customer.model.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class springTest {

    @Test
    public void studentTest(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("Applicationcontext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
    @Test
    public void customerTest(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("Applicationcontext.xml");
        Customer customer = new Customer(10001,"Spring",18);
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        customerDao.insert(customer);
        Customer customer1;
        customer1 = customerDao.findCustomerById(customer.getCustId());
        System.out.println(customer1);
    }
    @Test
    public void customerJdbcTest(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("Applicationcontext.xml");
        Customer customer = new Customer(10003,"Spring",18);
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        customerDao.insert(customer);
        Customer customer1 = customerDao.findCustomerById(customer.getCustId());
        System.out.println(customer1);

    }

}
