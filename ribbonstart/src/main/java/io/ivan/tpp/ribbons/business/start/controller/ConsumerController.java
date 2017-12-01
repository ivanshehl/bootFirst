package io.ivan.tpp.ribbons.business.start.controller;

import java.util.List;

import io.ivan.tpp.myboot.business.mycat.entity.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/use")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/test")
    public List<Order> add() {
        return restTemplate.getForEntity("http://order-service/order/find", List.class).getBody();
    }
}