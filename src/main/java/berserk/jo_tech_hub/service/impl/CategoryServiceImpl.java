package berserk.jo_tech_hub.service.impl;


import berserk.jo_tech_hub.Dto.CategoryCreateRequest;
import berserk.jo_tech_hub.entity.Category;
import berserk.jo_tech_hub.mapper.CategoryMapper;
import berserk.jo_tech_hub.repository.CategoryRepo;
import berserk.jo_tech_hub.repository.PostRepo;
import berserk.jo_tech_hub.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    private final CategoryMapper categoryMapper;


    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepo.findById(id).orElseThrow(
                RuntimeException::new
        );
    }

    @Override
    public Category save(CategoryCreateRequest request) {
        Category category = categoryMapper.toEntity(request);
        if(categoryRepo.existsByNameIgnoreCase(category.getName())) {
            throw new RuntimeException("Category with name " + category.getName() + " already exists");
        }
        return categoryRepo.save(category);
    }
}
