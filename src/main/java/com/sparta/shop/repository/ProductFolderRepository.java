package com.sparta.shop.repository;

import com.sparta.shop.entity.Folder;
import com.sparta.shop.entity.Product;
import com.sparta.shop.entity.ProductFolder;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {

    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
