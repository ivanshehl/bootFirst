package io.ivan.tpp.myboot.business.mycat.controller;

import io.ivan.tpp.myboot.business.mycat.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

/**
 * Created by fanlychie on 2017/6/20.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

//    @GetMapping("/find/{uid:[1-9]\\d+}")
	@GetMapping("/find")
    @ResponseBody
    public List<Order> home() {
		// orderService.addOrder();
		// orderService.addOrder();
		// orderService.addOrder();
		// orderService.addOrder();
		Map<String, String> mm = new HashMap<String, String>();
		mm.put("key", "val");
		List<Order> orders = Lists.newArrayList();
		Order order = new Order();
		order.setNo("noheiheihherer1");
		order.setProductName("productName");
		order.setTotalFee(10.00);
		order.setUid(110);
		orders.add(order);
		return orders;
	}

}