package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.Product;

public class ProductRepo extends AbstractEntityRepo<Product> {

    public ProductRepo() {
	super(Product.class);
    }

}
