package com.zalando.zalando.Controllers;

import com.zalando.zalando.Model.Services.CustomerRepository;
import com.zalando.zalando.Model.Services.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ICustomerRepository customerRepo = new CustomerRepository();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", customerRepo.readProducts());
        model.addAttribute("customers", customerRepo.readCustomers());
        model.addAttribute("orders", customerRepo.readOrders());
        model.addAttribute("orderProducts", customerRepo.readOrderProducts());
        return "index";
    }
}
