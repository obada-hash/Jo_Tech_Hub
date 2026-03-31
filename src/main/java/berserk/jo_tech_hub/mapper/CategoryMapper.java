package berserk.jo_tech_hub.mapper;

import berserk.jo_tech_hub.Dto.CategoryCreateRequest;
import berserk.jo_tech_hub.Dto.CategoryDto;
import berserk.jo_tech_hub.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toEntity(CategoryCreateRequest request);

    CategoryDto toDto(Category category);

}
