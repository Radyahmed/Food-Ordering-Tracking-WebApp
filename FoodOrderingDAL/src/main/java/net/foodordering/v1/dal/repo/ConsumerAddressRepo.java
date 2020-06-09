package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.ConsumerAddress;

public class ConsumerAddressRepo extends AbstractEntityRepo<ConsumerAddress> {

    public ConsumerAddressRepo() {
	super(ConsumerAddress.class);
    }

}
