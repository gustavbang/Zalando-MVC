package com.zalando.zalando.Model.Services;

import com.zalando.zalando.Model.Entities.Customer;
import com.zalando.zalando.Model.Entities.Order;
import com.zalando.zalando.Model.Entities.OrderProduct;
import com.zalando.zalando.Model.Entities.Product;

import java.util.ArrayList;
import java.util.List;

public interface ICustomerRepository {


public ArrayList<Product> readProducts();
public ArrayList<Customer> readCustomers();
public ArrayList<Order> readOrders();
public List<OrderProduct> readOrderProducts();

public void create(Customer customer);

public Customer getUser(String email, String password);

}
