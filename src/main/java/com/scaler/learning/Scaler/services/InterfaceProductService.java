package com.scaler.learning.Scaler.services;

import com.scaler.learning.Scaler.Dtos.ProductDto;

public interface InterfaceProductService {
    String getAllProducts();

    String getSingleProduct(Long productId);

    String addNewProduct(ProductDto productDto);

    String updateProduct(Long productId);

    String deleteProduct(Long productId);
}
