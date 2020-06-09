package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.DeliveryAreaBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.DeliveryArea;

public class DeliveryAreaTransformer implements RadyConstant, CommonTransformer<DeliveryArea, DeliveryAreaBean> {

    @Override
    public DeliveryAreaBean transformEntityToBean(DeliveryArea entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DeliveryArea transformBeanToEntity(DeliveryAreaBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
