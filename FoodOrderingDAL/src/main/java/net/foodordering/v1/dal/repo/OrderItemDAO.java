package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.OrderItem;

public class OrderItemDAO extends AbstractEntityRepo<OrderItem>{

    public OrderItemDAO() {
	super(OrderItem.class);
    }

    
}
