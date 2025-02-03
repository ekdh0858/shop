package com.sparta.shop.controller;

import com.sparta.shop.dto.ProductMypriceRequestDto;
import com.sparta.shop.dto.ProductRequestDto;
import com.sparta.shop.dto.ProductResponseDto;
import com.sparta.shop.entity.Product;
import com.sparta.shop.repository.ProductRepository;
import com.sparta.shop.service.ProductService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;
    private final ProductRepository productRepository;

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {
        return productService.createProduct(requestDto);
    }

    @PutMapping("/products/{id}")
    public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto){
        return productService.update(id,requestDto);
    }

    @GetMapping("/products")
    public List<ProductResponseDto> getProducts(){

        return productService.getProducts();

    }
}
