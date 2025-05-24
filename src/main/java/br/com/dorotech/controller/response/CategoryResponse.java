package br.com.dorotech.controller.response;

import br.com.dorotech.service.domain.CategoryDomain;
import br.com.dorotech.service.domain.ProductDomain;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponse {
    private Long id;
    private String name;

    public CategoryResponse toProductResponse(CategoryDomain domain) {
        return CategoryResponse.builder()
            .name(domain.getName())
            .id(domain.getId())
            .build();
    }
}
