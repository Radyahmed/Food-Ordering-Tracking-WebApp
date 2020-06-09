package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.CategoryBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.Category;

public class CategoryTransformer implements RadyConstant, CommonTransformer<Category, CategoryBean> {

    @Override
    public CategoryBean transformEntityToBean(Category entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category transformBeanToEntity(CategoryBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
