package br.com.dorotech.service.domain;

import br.com.dorotech.model.CategoryEntity;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDomain {
    private Long id;
    private String name;

    public CategoryEntity createCategoryEntity() {
        return CategoryEntity.builder()
                .name(this.name)
                .build();
    }

    public CategoryDomain toCategoryDomain(CategoryEntity entity){
        return CategoryDomain.builder()
            .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
