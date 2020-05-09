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


	// add mapping for GET /wishlist
	@GetMapping("/wishlist/{retailerId}")
	public List<Wishlist> findAll(@PathVariable String retailerId) {

		return wishlistService.findAll(retailerId);

	}

	@PostMapping("/wishlist")
	public Wishlist addProducttoWishlist(@RequestBody Wishlist theWishlist) {

		wishlistService.save(theWishlist);

		return theWishlist;
	}

	@DeleteMapping("/wishlist/{productId}/{retailerId}")
	public String deleteProductfromWishlist(@PathVariable String productId,@PathVariable String retailerId) {
		Wishlist tempWishlist = wishlistService.findById(productId,retailerId);

		// throw exception if null

		if (tempWishlist == null) {
			throw new RuntimeException("Product id not found - " + productId);
		}

		wishlistService.deleteById(productId,retailerId);
		return "Deleted product from wishlist  id- " + productId;
	}

}
