package com.ecommerce.service;

import com.ecommerce.payload.ProductDTO;
import com.ecommerce.payload.ProductResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ProductService {
    ProductDTO addProduct(ProductDTO productDTO, Long categoryId);
    ProductResponse getAllProduct();
    ProductResponse getAllProductsByCategory(Long categoryId);
    ProductResponse getAllProductsByKeyword(String keyword);
    ProductDTO updateProduct(Long productId, ProductDTO productDTO);
    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
    String deleteProduct(Long productId);
    //ResponseEntity getProductBySeller();
}
