package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.BranchBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.Branch;

public class BranchTransformer implements RadyConstant, CommonTransformer<Branch, BranchBean> {

    @Override
    public BranchBean transformEntityToBean(Branch entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Branch transformBeanToEntity(BranchBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
