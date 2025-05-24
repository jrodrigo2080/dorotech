package br.com.dorotech.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dorotech.controller.request.CategoryRequest;
import br.com.dorotech.controller.request.ProductRequest;
import br.com.dorotech.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/categories")
@Data
public class CategoryController {
    private final CategoryService categoryService;
    
    @PostMapping
    public String create(@RequestBody  CategoryRequest categoryRequest) {
       this.categoryService.create(categoryRequest.createCategoryDomain());
        return "category created with success";
    }

}
