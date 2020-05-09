package com.cg.wms.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.wms.entity.Wishlist;

public interface WishlistRepo extends JpaRepository<Wishlist, String> {
	@Query("select w from Wishlist w where w.retailerId=?1")
	List<Wishlist> findAll(String retailerId);
	
	@Query("select w from Wishlist w where w.retailerId=?2 and w.productId=?1")
	Optional<Wishlist> findById(String theId,String retailerId);
	
	@Query("delete from Wishlist w where w.productId=?1 and w.retailerId=?2")
	void deleteById(String theId,String retailerId);
}
