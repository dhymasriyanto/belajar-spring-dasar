package ngodingkuy.tech.spring.core.service;
/**
*CategoryService 
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import ngodingkuy.tech.spring.core.repository.CategoryRepository;

@Component
public class CategoryService {

	@Getter
	private CategoryRepository categoryRepository;

	@Autowired
	public void setCategoryRepository(CategoryRepository categoryRepository) {
			this.categoryRepository = categoryRepository;
	}
}

