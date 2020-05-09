package com.cg.wms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.wms.entity.Product;
import com.cg.wms.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepo productRepo;

	@Autowired
	public ProductServiceImpl(ProductRepo theProductRepo ) {
		productRepo = theProductRepo;
	}

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public Product findById(String theId) {
		Optional<Product> result = productRepo.findById(theId);
		
		Product theWishlist = null;
		
		if (result.isPresent()) {
			theWishlist = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find product id - " + theId);
		}
		
		return theWishlist;
	}

	@Override
	public void deleteById(String theId) {
		productRepo.deleteById(theId);
		
	}

	@Override
	public void save(Product theProduct) {
		productRepo.save(theProduct);
		
	}

}
