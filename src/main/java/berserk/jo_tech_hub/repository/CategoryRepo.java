package berserk.jo_tech_hub.repository;


import berserk.jo_tech_hub.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface CategoryRepo extends JpaRepository<Category, Long> {

    boolean existsByNameIgnoreCase(String name);
}
