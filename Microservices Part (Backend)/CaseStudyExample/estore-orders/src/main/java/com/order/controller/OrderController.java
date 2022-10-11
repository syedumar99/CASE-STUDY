package com.order.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Orders;
import com.order.repository.OrderRepository;



@RestController
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {
	
	Optional<Orders> o1;
	
	@Autowired
	private OrderRepository orepository;
	
	@GetMapping("/orders")
	public List<Orders> getAllOrder(){
		return orepository.findAll();
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity getOrderById(@PathVariable(value = "id") long order_id) {
		o1 = orepository.findById((long) order_id);
		return ResponseEntity.ok().body(o1);
	}
	
	@PostMapping(value = "/orders")
	public Orders saveOrder(@RequestBody Orders orod) {
		return orepository.save(orod);
	}
	
    
    @DeleteMapping(value="/orders/{id}")
    public ResponseEntity deleteOrder
    (@PathVariable(value="id")Long order_id) {
    	orepository.deleteById(order_id);
    	return ResponseEntity.noContent().build();
    }
	
}