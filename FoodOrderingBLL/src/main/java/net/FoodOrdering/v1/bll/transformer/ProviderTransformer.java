package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.ProviderBean;
import net.foodordering.v1.dal.entity.annotation.Provider;

public class ProviderTransformer implements CommonTransformer<Provider, ProviderBean> {

    @Override
    public ProviderBean transformEntityToBean(Provider entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Provider transformBeanToEntity(ProviderBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
