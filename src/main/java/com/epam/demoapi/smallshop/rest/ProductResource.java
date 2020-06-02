package com.epam.demoapi.smallshop.rest;

import com.epam.demoapi.smallshop.domain.Product;
import com.epam.demoapi.smallshop.dto.ProductDto;
import com.epam.demoapi.smallshop.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductResource {
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return null; //TODO implement
    }

    @PostMapping
    public Product createProduct(ProductDto productDto) {
        return null;  //TODO implement
    }

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable("productId") Integer productId) {
        return productService.getProduct(productId);
    }
}
