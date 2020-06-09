package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.ProviderUser;

public class ProviderUserRepo extends AbstractEntityRepo<ProviderUser> {

    public ProviderUserRepo() {
	super(ProviderUser.class);
    }

}
