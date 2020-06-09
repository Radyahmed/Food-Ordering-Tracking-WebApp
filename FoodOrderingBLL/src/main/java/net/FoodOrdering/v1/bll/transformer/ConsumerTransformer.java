package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.ConsumerBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.Consumer;

public class ConsumerTransformer implements RadyConstant, CommonTransformer<Consumer, ConsumerBean> {

    @Override
    public ConsumerBean transformEntityToBean(Consumer entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consumer transformBeanToEntity(ConsumerBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
