package br.com.dorotech.controller.request;

import java.io.Serializable;

import br.com.dorotech.service.domain.CategoryDomain;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryRequest implements Serializable {
    private String name;

     public CategoryDomain createCategoryDomain() {
        return CategoryDomain.builder()
                .name(this.name)
                .build();
    }
}
