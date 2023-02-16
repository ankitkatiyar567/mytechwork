package com.techguy.repository;

import com.techguy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
   // Product findBySupplierCode(String supplierCode);
}
