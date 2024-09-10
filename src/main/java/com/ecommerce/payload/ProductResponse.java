package com.ecommerce.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    List<ProductDTO> content;

	public List<ProductDTO> getContent() {
		return content;
	}

	public void setContent(List<ProductDTO> content) {
		this.content = content;
	}
    
}
