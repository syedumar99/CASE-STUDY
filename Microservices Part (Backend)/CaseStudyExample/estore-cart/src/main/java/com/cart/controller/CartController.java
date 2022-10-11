package com.cart.controller;

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

import com.cart.model.Cart;
import com.cart.repository.CartRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CartController {
	
	Optional<Cart> c1;
	
	@Autowired
	private CartRepository prepository;
	
	@GetMapping("/cart")
	public List<Cart> getAllProducts(){
		return prepository.findAll();
	}
	
	@GetMapping("/cart/{id}")
	public ResponseEntity getProductsById(@PathVariable(value = "id") long prod_id) {
		c1 = prepository.findById((long) prod_id);
		return ResponseEntity.ok().body(c1);
	}
	
	@PostMapping(value = "/cart")
	public Cart saveProducts(@RequestBody Cart car) {
		return prepository.save(car);
	}
	
    @PutMapping(value="/cart/{id}")
    public ResponseEntity updateProducts (@PathVariable(value="id") Long prod_id,
    @Validated @RequestBody Cart cdata){
        c1 = prepository.findById(prod_id);
        Cart c2 = c1.get();
        c2.setProd_id(cdata.getProd_id());
        c2.setProd_quantity(cdata.getProd_quantity());
        c2.setPayment_mode(cdata.getPayment_mode());
      
        Cart updateProducts = prepository.save(c2);
        return ResponseEntity.ok(updateProducts);
    } 
	
    
    @DeleteMapping(value="/cart/{id}")
    public ResponseEntity deleteProducts(@PathVariable(value="id")Long prod_id) {
    	prepository.deleteById(prod_id);
    	return ResponseEntity.noContent().build();
    }
	
}
