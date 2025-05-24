package br.com.dorotech.service;

import org.springframework.stereotype.Service;

import br.com.dorotech.repository.CategoryRepository;
import br.com.dorotech.service.domain.CategoryDomain;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryDomain create(CategoryDomain domain) {
        var entity = this.categoryRepository.save(domain.createCategoryEntity());
        return  domain.toCategoryDomain(entity);
    }
}
