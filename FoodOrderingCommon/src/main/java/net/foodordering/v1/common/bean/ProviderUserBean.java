package net.foodordering.v1.common.bean;

public class ProviderUserBean {

    private Integer id;
    private String userName;
    private String password;
    private Byte active;

    public ProviderUserBean() {
    }

    public ProviderUserBean(Integer id, String userName, String password, Byte active) {
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.active = active;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Byte getActive() {
	return active;
    }

    public void setActive(Byte active) {
	this.active = active;
    }

}
