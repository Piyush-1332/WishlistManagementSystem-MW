package com.cg.wms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.wms.entity.Wishlist;

public interface WishlistRepo extends JpaRepository<Wishlist, String> {

}
