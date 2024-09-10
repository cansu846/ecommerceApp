package com.ecommerce.service;

import com.ecommerce.payload.CategoryDTO;
import com.ecommerce.payload.CategoryResponse;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryResponse getAllCategories();
    CategoryDTO updateCategory(Long categoryId, CategoryDTO categoryDTO);
    String deleteCategory(Long id);
}
