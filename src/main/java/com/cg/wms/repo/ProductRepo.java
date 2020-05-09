package com.cg.wms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.wms.entity.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
