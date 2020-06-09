package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.ProductBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.Product;

public class ProductTransformer implements RadyConstant, CommonTransformer<Product, ProductBean> {

    @Override
    public ProductBean transformEntityToBean(Product entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product transformBeanToEntity(ProductBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
