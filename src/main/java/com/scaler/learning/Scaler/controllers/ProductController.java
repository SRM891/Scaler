package com.scaler.learning.Scaler.controllers;

import com.scaler.learning.Scaler.Dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("")
    public String getAllProduct() {
        return "Getting all the products";
    }

    @GetMapping("/{id}")
    public String getSingleProduct(@PathVariable("id") Long id) {
        return "Returning the single product id "+ id;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "Adding new product "+ productDto;
    }
}
