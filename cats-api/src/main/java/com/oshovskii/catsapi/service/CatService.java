package com.oshovskii.catsapi.service;

import com.oshovskii.catsapi.dto.CatDto;
import com.oshovskii.catsapi.entity.Cat;
import com.oshovskii.catsapi.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        Cat cat = new Cat()
                .setName(catDto.getName())
                .setBirthday(catDto.getBirthday())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
        return catRepository.save(cat);
    }

    // Исправить на Pageable
    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
