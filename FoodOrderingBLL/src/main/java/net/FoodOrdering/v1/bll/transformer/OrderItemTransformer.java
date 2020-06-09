package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.OrderItemBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.OrderItem;

public class OrderItemTransformer implements RadyConstant, CommonTransformer<OrderItem, OrderItemBean> {

    @Override
    public OrderItemBean transformEntityToBean(OrderItem entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderItem transformBeanToEntity(OrderItemBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
