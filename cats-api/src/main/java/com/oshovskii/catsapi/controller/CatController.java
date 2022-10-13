package com.oshovskii.catsapi.controller;

import com.oshovskii.catsapi.dto.CatDto;
import com.oshovskii.catsapi.entity.Cat;
import com.oshovskii.catsapi.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @PostMapping()
    public Cat save(@RequestBody CatDto cat) {
        return catService.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }
}
