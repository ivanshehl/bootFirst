package io.ivan.tpp.business.mycat.service.impl;

import io.ivan.tpp.business.mycat.dao.HotelMapper;
import io.ivan.tpp.business.mycat.entity.Hotel;
import io.ivan.tpp.business.mycat.service.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	
	@Autowired
	private HotelMapper hotelMapper;

	public void addOrder() {
	
	}
	
	public void addHotel(List<Hotel> hotels){
		for(Hotel hotel : hotels){
			hotelMapper.insert(hotel);
		}
	}
}
