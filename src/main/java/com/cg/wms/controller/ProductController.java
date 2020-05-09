package com.cg.wms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.wms.entity.Product;
import com.cg.wms.service.ProductService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> findAll() {

		return productService.findAll();

	}

	@PostMapping("/products")
	public Product addProduct(@RequestBody Product theProduct) {

		productService.save(theProduct);

		return theProduct;
	}

	@DeleteMapping("/products/{productId}")
	public String deleteProductfromProducts(@PathVariable String productId) {
		Product tempProductlist = productService.findById(productId);

		// throw exception if null

		if (tempProductlist == null) {
			throw new RuntimeException("Product id not found - " + productId);
		}

		productService.deleteById(productId);
		return "Deleted product from Products  id- " + productId;
	}
}
