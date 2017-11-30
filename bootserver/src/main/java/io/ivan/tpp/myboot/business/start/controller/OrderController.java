package io.ivan.tpp.myboot.business.start.controller;

import io.ivan.tpp.myboot.business.start.entity.Order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanlychie on 2017/6/20.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/find/{uid:[1-9]\\d+}")
    public List<Order> findByUid(@PathVariable Integer uid) {
        System.out.println("-----------------------+uid+-------------------------");
        System.out.println("------------------ 方法被调用 ------------------");
        System.out.println("------------------------------------------------");
        return new ArrayList<Order>();
    }

}