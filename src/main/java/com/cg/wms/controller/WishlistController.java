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

import com.cg.wms.entity.Wishlist;
import com.cg.wms.service.WishlistService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class WishlistController {
// autowire the WishlistService
	@Autowired
	private WishlistService wishlistService;


	// add mapping for GET /customers
	@GetMapping("/wishlist")
	public List<Wishlist> findAll() {

		return wishlistService.findAll();

	}

	@PostMapping("/wishlist")
	public Wishlist addProducttoWishlist(@RequestBody Wishlist theWishlist) {

		wishlistService.save(theWishlist);

		return theWishlist;
	}

	@DeleteMapping("/wishlist/{productId}")
	public String deleteProductfromWishlist(@PathVariable String productId) {
		Wishlist tempWishlist = wishlistService.findById(productId);

		// throw exception if null

		if (tempWishlist == null) {
			throw new RuntimeException("Product id not found - " + productId);
		}

		wishlistService.deleteById(productId);
		return "Deleted product from wishlist  id- " + productId;
	}

}
