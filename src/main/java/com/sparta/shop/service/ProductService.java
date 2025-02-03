package com.sparta.shop.service;

import com.sparta.shop.dto.ProductRequestDto;
import com.sparta.shop.dto.ProductResponseDto;
import com.sparta.shop.entity.Product;
import com.sparta.shop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
