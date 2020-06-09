package net.foodordering.v1.common.bean;

public class ConsumerBean {

    private Integer id;
    private String userName;
    private String password;
    private String fullName;
    private String phone;

    public ConsumerBean() {
    }

    public ConsumerBean(Integer id, String userName, String password, String fullName, String phone) {
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.fullName = fullName;
	this.phone = phone;
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

    public String getFullName() {
	return fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

}
