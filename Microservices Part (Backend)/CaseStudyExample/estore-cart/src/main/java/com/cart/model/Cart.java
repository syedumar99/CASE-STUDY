package com.cart.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cart {
		
		@Id
		private long prod_id;
		private String prod_quantity;
		private String payment_mode;
		
		public Cart(){}

		public Cart(long prod_id, String prod_quantity, String payment_mode) {
			super();
			this.prod_id = prod_id;
			this.prod_quantity = prod_quantity;
			this.payment_mode = payment_mode;
		}

		public long getProd_id() {
			return prod_id;
		}

		public void setProd_id(long prod_id) {
			this.prod_id = prod_id;
		}

		public String getProd_quantity() {
			return prod_quantity;
		}

		public void setProd_quantity(String prod_quantity) {
			this.prod_quantity = prod_quantity;
		}

		public String getPayment_mode() {
			return payment_mode;
		}

		public void setPayment_mode(String payment_mode) {
			this.payment_mode = payment_mode;
		}
		
		
		


}
