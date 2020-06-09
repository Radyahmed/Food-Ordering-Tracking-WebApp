package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.AdminUserBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.AdminUser;

public class AdminUserTransformer implements RadyConstant, CommonTransformer<AdminUser, AdminUserBean> {

    @Override
    public AdminUserBean transformEntityToBean(AdminUser entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AdminUser transformBeanToEntity(AdminUserBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
