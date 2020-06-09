package net.foodordering.v1.dal.entity.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_user")
public class AdminUser implements java.io.Serializable {

    private static final long serialVersionUID = 5701523913019766072L;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "username", unique = true, nullable = false, length = 50)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "active", nullable = false)
    private byte active;

    public AdminUser() {
    }

    public AdminUser(String username, String password, byte active) {
	this.username = username;
	this.password = password;
	this.active = active;
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getUsername() {
	return this.username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return this.password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public byte getActive() {
	return this.active;
    }

    public void setActive(byte active) {
	this.active = active;
    }

}
