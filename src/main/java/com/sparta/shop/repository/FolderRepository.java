package com.sparta.shop.repository;

import com.sparta.shop.entity.Folder;
import com.sparta.shop.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {

    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // select * from folder where user_id = 1 and name in ('z','a','t');

    List<Folder> findAllByUser(User user);

}
