package com.cg.wms.service;

import java.util.List;

import com.cg.wms.entity.Product;

public interface ProductService {
	
	public Product findById(String theId);
	
	public void deleteById(String theId);

	public void save(Product theProduct);

	public List<Product> findAll();

}
