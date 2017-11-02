package com.zalando.zalando.Controllers;

import com.zalando.zalando.Model.Entities.Customer;
import com.zalando.zalando.Model.Services.CustomerRepository;
import com.zalando.zalando.Model.Services.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Customer customer) {
        customerRepo.create(customer);
        return "redirect:/";
    }

    @GetMapping("/login")
        public String login(Model model) {
        model.addAttribute("customer", new Customer());
        return "login";
        }

    @PostMapping("/login")
    public String login(@ModelAttribute Customer customer) {
        customer = customerRepo.getUser(customer.getEmail(), customer.getPassword());
        if (customer == null) {
            return "login";
        } return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("customer", new Customer());
        return "home";
    }
}
