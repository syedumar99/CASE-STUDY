package com.products.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.products;
import com.products.repository.ProductsRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProductsController {
	
	Optional<products> p1;
	
	@Autowired
	private ProductsRepository prepository;
	
	@GetMapping("/products")
	public List<products> getAllProducts(){
		return prepository.findAll();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity getProductsById(@PathVariable(value = "id") long prod_id) {
		p1 = prepository.findById((long) prod_id);
		return ResponseEntity.ok().body(p1);
	}
	
	@PostMapping(value = "/products")
	public products saveProducts(@RequestBody products prod) {
		return prepository.save(prod);
	}
	
 
	
    
    @DeleteMapping(value="/products/{id}")
    public ResponseEntity deleteProducts(@PathVariable(value="id")Long prod_id) {
    	prepository.deleteById(prod_id);
    	return ResponseEntity.noContent().build();
    }
	
}
