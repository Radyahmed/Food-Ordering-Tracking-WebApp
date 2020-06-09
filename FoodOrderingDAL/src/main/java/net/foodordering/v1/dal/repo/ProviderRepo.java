package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.Provider;

public class ProviderRepo extends AbstractEntityRepo<Provider> {

    public ProviderRepo() {
	super(Provider.class);
    }

}
