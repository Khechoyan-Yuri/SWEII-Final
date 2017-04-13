package com.sweng.customerqueue.service;

import com.sweng.customerqueue.model.Customer;

import java.util.List;

/**
 * Created by ZAnwar on 2/28/2017.
 */
public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer category);
    void delete(Customer category);
}
