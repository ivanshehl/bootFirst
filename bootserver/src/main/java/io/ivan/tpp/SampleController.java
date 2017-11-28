package io.ivan.tpp;

import io.ivan.tpp.business.mycat.entity.Hotel;
import io.ivan.tpp.business.mycat.service.OrderService;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@EnableAutoConfiguration
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@MapperScan("io.ivan.tpp.business.*.dao")
@SpringBootApplication
public class SampleController {
	
	@Autowired
	private OrderService orderService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
//    	orderService.addOrder();
//    	orderService.addOrder();
//    	orderService.addOrder();
//    	orderService.addOrder();
    	
    	List<Hotel> hotels = null;
    	Hotel e = null;
    	for(int i = 0; i < 1000; i++){
    		hotels = new ArrayList<Hotel>(5000);
    		for(int j = 0; j < 5000; j++){
    			e = new Hotel();
    			e.setAddress("setAddress");
    			e.setCity(123L);
    			e.setName("setName");
    			e.setZip("setZip");
    			hotels.add(e);
    		}
    		orderService.addHotel(hotels);
    	}
    	
        return "Hello World!";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
