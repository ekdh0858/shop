package com.sparta.shop.repository;

import com.sparta.shop.entity.Product;
import com.sparta.shop.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByUser(User user);
}
