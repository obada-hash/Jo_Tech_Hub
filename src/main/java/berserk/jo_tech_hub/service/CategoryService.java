package berserk.jo_tech_hub.service;

import berserk.jo_tech_hub.Dto.CategoryCreateRequest;
import berserk.jo_tech_hub.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();
    Category findById(Long id);
    Category save(CategoryCreateRequest request);

}
