package com.ecommerce.service;

import com.ecommerce.model.Category;
import com.ecommerce.payload.CategoryDTO;
import com.ecommerce.payload.CategoryResponse;
import com.ecommerce.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CategoryServiceImp implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;
    private ModelMapper modelMapper;

    //private List<Category> categories = new ArrayList<>();
    //private Long nextId = 1L;

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        //category.setCategoryId(nextId++);
        //categories.add(category);

        Category category = this.modelMapper.map(categoryDTO, Category.class);
        Category categoryFromDb = this.categoryRepository.findByCategoryName(category.getCategoryName());
        if(categoryFromDb != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Category already exists");
        }
        else{
            Category savedCategory = (Category) this.categoryRepository.save(category);
            return this.modelMapper.map(savedCategory, CategoryDTO.class);
        }
    }

    @Override
    public CategoryResponse getAllCategories() {
        //return categories;
        List<Category> categories = this.categoryRepository.findAll();
        List<CategoryDTO> categoriesDTO = categories.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .toList();

        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setContent(categoriesDTO);
        return categoryResponse;
    }

    @Override
    public CategoryDTO updateCategory(Long categoryId,CategoryDTO categoryDTO) {
       /* Optional<Category> optionalCategory = categories.stream()
                .filter(c-> c.getCategoryId().equals(categoryId))
                .findFirst();
        if(optionalCategory.isPresent()){
            Category categoryToUpdate = optionalCategory.get();
            categoryToUpdate.setCategoryName(category.getCategoryName());
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Category not found");
        }*/
        Category category = this.modelMapper.map(categoryDTO, Category.class);
        Optional<Category> categoryTemp = this.categoryRepository.findById(categoryId);

        if(categoryTemp == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found");
        }

        category.setCategoryId(categoryId);
        Category newCategory = categoryRepository.save(category);
        return this.modelMapper.map(newCategory, CategoryDTO.class);
    }

    @Override
    public String deleteCategory(Long id) {
        /* Category optionalCategory = categories.stream()
                .filter(c->c.getCategoryId().equals(id))
                .findFirst()
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found"));

                categories.remove(optionalCategory);

        return "Category with categoryId: " + id + " deleted successfully !!"; */

        categoryRepository.deleteById(id);
        return "Category deleted";



    }
}
