package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.OrderBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.Order;

public class OrderTransformer implements RadyConstant, CommonTransformer<Order, OrderBean> {

    @Override
    public OrderBean transformEntityToBean(Order entity, String lang) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order transformBeanToEntity(OrderBean bean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
