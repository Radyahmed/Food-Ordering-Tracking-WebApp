package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.ProviderUserBean;
import net.foodordering.v1.dal.entity.annotation.ProviderUser;

public class ProviderUserTransformer implements CommonTransformer<ProviderUser, ProviderUserBean> {

    @Override
    public ProviderUserBean transformEntityToBean(ProviderUser entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProviderUser transformBeanToEntity(ProviderUserBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
