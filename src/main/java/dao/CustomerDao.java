package dao;


import com.sweng.customerqueue.model.Customer;

import java.util.List;

/**
 * Created by ZAnwar on 2/27/2017.
 */
public interface CustomerDao {
    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer category);
    void delete(Customer category);
}