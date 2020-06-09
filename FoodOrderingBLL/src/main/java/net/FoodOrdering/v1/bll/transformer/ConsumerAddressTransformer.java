package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.ConsumerAddressBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.ConsumerAddress;

public class ConsumerAddressTransformer implements RadyConstant, CommonTransformer<ConsumerAddress, ConsumerAddressBean> {

    @Override
    public ConsumerAddressBean transformEntityToBean(ConsumerAddress entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConsumerAddress transformBeanToEntity(ConsumerAddressBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
