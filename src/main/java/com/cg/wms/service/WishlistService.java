package com.cg.wms.service;

import java.util.List;

import com.cg.wms.entity.Wishlist;

public interface WishlistService {
	public List<Wishlist> findAll(String retailerId);
	
	public Wishlist findById(String theId,String retailerId);
	
	public void deleteById(String theId,String retailerId);

	public void save(Wishlist theWishlist);

}
