package com.cart;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cart.model.Cart;
import com.cart.repository.CartRepository;



@SpringBootTest
class EstoreCartApplicationTests {

	@Autowired
	CartRepository cRepo;
	
	@Test   // TO INSERT A DATABASE INTO DB(POST METHOD)
	public void testCreate() {
		Cart c = new Cart();
		c.setProd_id(1L);
		c.setPayment_mode("cash");
		c.setProd_quantity("five kgs");
		cRepo.save(c);
		assertNotNull(cRepo.findById(1L).get());
		
	}
	
@Test  // TO READALL DATA(GET METHOD)
public void testReadAll() {  
		List<Cart>list = cRepo.findAll();
	assertThat(list).size().isGreaterThan(0);
		}	
      @Test // TO UPDATE THE DATA (PUT METHOD)
      public void testUpdate() {
      cRepo.findById(1L).get();
      Cart c = new Cart();
      c.setPayment_mode("online");
	  cRepo.save(c);
	  assertNotEquals("cash",cRepo.findById(1L).get().getPayment_mode());
	}
@Test // TO DELETE(
public void testDelete() {
	cRepo.deleteById(1L);
	assertThat(cRepo.existsById(1L)).isFalse();

	}
}
