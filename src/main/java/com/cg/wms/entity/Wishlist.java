package com.cg.wms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {
	@Id
	@Column(name = "product_id")
	String productId;
	@Column(name = "price", nullable = false)
	int price;
	@Column(name = "colour", nullable = false)
	String colour;
	@Column(name = "dimension", nullable = false)
	String dimension;
	@Column(name = "specification", nullable = false)
	String specification;
	@Column(name = "manufacturer", nullable = false)
	String manufacturer;
	@Column(name = "quantity", nullable = false)
	int quantity;
	@Column(name = "product_category", nullable = false)
	int productCategory;
	@Column(name = "product_name", nullable = false)
	String productName;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
