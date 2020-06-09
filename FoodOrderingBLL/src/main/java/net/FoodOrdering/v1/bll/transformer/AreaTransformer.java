package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.AreaBean;
import net.foodordering.v1.dal.entity.annotation.Area;
import net.foodordering.v1.common.constant.RadyConstant;

public class AreaTransformer implements RadyConstant, CommonTransformer<Area, AreaBean> {

    @Override
    public AreaBean transformEntityToBean(Area entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Area transformBeanToEntity(AreaBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
