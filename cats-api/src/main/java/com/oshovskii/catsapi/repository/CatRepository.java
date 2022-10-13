package com.oshovskii.catsapi.repository;

import com.oshovskii.catsapi.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {
}
