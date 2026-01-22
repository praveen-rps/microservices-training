
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Set;

import com.example.demo.entity.Order;
import com.example.demo.entity.Product;
import com.example.demo.repository.OrderRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Product p1 = new Product();
        p1.setName("Laptop");

        Product p2 = new Product();
        p2.setName("Mouse");

        Order order = new Order();
        order.setPurchaseDate(new Date());
        order.setProducts(Set.of(p1, p2));

        orderRepository.save(order);

        System.out.println("Order and Products saved successfully");
    }
}
