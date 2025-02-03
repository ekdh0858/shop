package com.sparta.shop.controller;

import com.sparta.shop.dto.ProductRequestDto;
import com.sparta.shop.dto.ProductResponseDto;
import com.sparta.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;
    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {
        return productService.createProduct(requestDto);
    }
}
