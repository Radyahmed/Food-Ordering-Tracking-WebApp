package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.Consumer;

public class ConsumerRepo extends AbstractEntityRepo<Consumer> {

    public ConsumerRepo() {
	super(Consumer.class);
    }

}
