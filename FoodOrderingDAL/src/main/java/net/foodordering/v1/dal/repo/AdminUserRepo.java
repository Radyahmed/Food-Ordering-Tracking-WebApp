package net.foodordering.v1.dal.repo;

import net.foodordering.v1.dal.entity.annotation.AdminUser;

public class AdminUserRepo extends AbstractEntityRepo<AdminUser>{

    public AdminUserRepo() {
	super(AdminUser.class);
    }

    
}
