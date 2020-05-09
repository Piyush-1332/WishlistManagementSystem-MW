package com.cg.wms.service;

import java.util.List;

import com.cg.wms.entity.Wishlist;

public interface WishlistService {
	public List<Wishlist> findAll();
	
	public Wishlist findById(String theId);
	
	public void deleteById(String theId);

	public void save(Wishlist theWishlist);

}
