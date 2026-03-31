package berserk.jo_tech_hub.controller;


import berserk.jo_tech_hub.Dto.CategoryCreateRequest;
import berserk.jo_tech_hub.Dto.CategoryDto;
import berserk.jo_tech_hub.entity.Category;
import berserk.jo_tech_hub.mapper.CategoryMapper;
import berserk.jo_tech_hub.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<CategoryDto> create(@RequestBody CategoryCreateRequest request) {
        CategoryDto dto = categoryMapper.toDto(categoryService.save(request));
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }


}
