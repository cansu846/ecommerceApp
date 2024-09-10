package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.payload.CartDTO;
import com.ecommerce.repositories.CartRepository;

import jakarta.transaction.Transactional;

import java.util.List;

public interface CartService {

	CartDTO addProductToCart(Long productId, Integer quantity);
	
	List<CartDTO> getAllCarts();
	
	CartDTO getCart(String emailId, Long cartId);
	
	@Transactional
	CartDTO updateProductQuantityInCart(Long productId, Integer quantity);
	
	String deleteProductFromCart(Long cartId, Long productId);
	
	void updateProductInCarts(Long cartId, Long productId);
}
