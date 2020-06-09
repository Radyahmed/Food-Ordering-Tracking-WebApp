package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.Category;

public class CategoryRepo extends AbstractEntityRepo<Category> {

    public CategoryRepo() {
	super(Category.class);
    }

}
