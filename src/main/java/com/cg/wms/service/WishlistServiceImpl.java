package com.cg.wms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.wms.entity.Wishlist;
import com.cg.wms.repo.WishlistRepo;

@Service
public class WishlistServiceImpl implements WishlistService {

	private WishlistRepo wishlistRepo;

	@Autowired
	public WishlistServiceImpl(WishlistRepo theWishlistRepo) {
		wishlistRepo = theWishlistRepo;
	}

	@Override
	public List<Wishlist> findAll() {
		return wishlistRepo.findAll();
	}

	@Override
	public Wishlist findById(String theId) {
		Optional<Wishlist> result = wishlistRepo.findById(theId);
		
		Wishlist theWishlist = null;
		
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
		wishlistRepo.deleteById(theId);
		
	}

	@Override
	public void save(Wishlist theWishlist) {
		wishlistRepo.save(theWishlist);
		
	}

}
