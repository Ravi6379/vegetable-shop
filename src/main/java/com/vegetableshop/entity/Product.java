package com.vegetableshop.entity;

import java.time.LocalDateTime;

import com.vegetableshop.enums.Unit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name is required")
    private String productName;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    @NotNull(message = "Stock quantity is required")
    @PositiveOrZero(message = "Stock quantity cannot be negative")
    private Integer stockQuantity;

    @NotNull(message = "Unit is required")
    private Unit unit;

    private String imageUrl;

    @NotNull(message = "Availability is required")
    private Boolean available;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    
    

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", description=" + description + ", price="
				+ price + ", stockQuantity=" + stockQuantity + ", unit=" + unit + ", imageUrl=" + imageUrl
				+ ", available=" + available + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
    
   

}