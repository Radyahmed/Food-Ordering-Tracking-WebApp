package net.foodordering.v1.dal.repo;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import static net.foodordering.v1.dal.DBConnectionManager.getCurrentSession;
import net.foodordering.v1.dal.entity.annotation.Order;
import org.hibernate.query.Query;

public class OrderRepo extends AbstractEntityRepo<Order> {

    public OrderRepo() {
	super(Order.class);
    }

}
