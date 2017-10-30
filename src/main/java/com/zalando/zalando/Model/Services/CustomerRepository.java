package com.zalando.zalando.Model.Services;

import com.zalando.zalando.Model.Entities.Customer;
import com.zalando.zalando.Model.Entities.Order;
import com.zalando.zalando.Model.Entities.OrderProduct;
import com.zalando.zalando.Model.Entities.Product;
import com.zalando.zalando.Model.Repositories.OPRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {

    @Autowired
    private JdbcTemplate jdbc;

    // til den nederste metode
    @Autowired
    OPRepo opRepo;


    public ArrayList<Product> readProducts() {
        ArrayList<Product> products = new ArrayList<>();
        SqlRowSet sqlRowSet = jdbc.queryForRowSet("select * from zalando.products");
        while (sqlRowSet.next()) {
            products.add(new Product(sqlRowSet.getString("name"), sqlRowSet.getString("color"), sqlRowSet.getInt("price"), sqlRowSet.getInt("product_id")));
        }
        return products;

    }

    public ArrayList<Customer> readCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        SqlRowSet sqlRowSet = jdbc.queryForRowSet("SELECT * FROM zalando.customers");
        while (sqlRowSet.next()) {
            customers.add(new Customer(sqlRowSet.getString("first_name"), sqlRowSet.getString("last_name"), sqlRowSet.getString("email"), sqlRowSet.getString("password"), sqlRowSet.getString("gender"), sqlRowSet.getString("mobile_number"), sqlRowSet.getString("town"), sqlRowSet.getInt("postcode"), sqlRowSet.getString("country"), sqlRowSet.getInt("customerID")));
        }
        return customers;
    }

    @Override
    public ArrayList<Order> readOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        SqlRowSet sqlRowSet = jdbc.queryForRowSet("SELECT * FROM zalando.`order`");
        while (sqlRowSet.next()) {
            orders.add(new Order(sqlRowSet.getByte("order_id"), sqlRowSet.getDate("date"), sqlRowSet.getByte("total_due"), sqlRowSet.getByte("fk_customer_id")));
        }
        return orders;
    }

    @Override
    public List<OrderProduct> readOrderProducts() {
        return opRepo.findAll();
    }
}
