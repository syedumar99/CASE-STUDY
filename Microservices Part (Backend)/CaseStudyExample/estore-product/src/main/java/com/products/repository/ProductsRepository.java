package com.products.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.products;

@Repository
public interface ProductsRepository extends JpaRepository<products, Long>{


}
