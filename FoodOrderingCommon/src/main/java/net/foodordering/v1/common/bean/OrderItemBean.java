package net.foodordering.v1.common.bean;

public class OrderItemBean {

    private Integer id;
    private int quantity;
    private float price;

    public OrderItemBean() {
    }

    public OrderItemBean(Integer id, int quantity, float price) {
	this.id = id;
	this.quantity = quantity;
	this.price = price;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public int getQuantity() {
	return quantity;
    }

    public void setQuantity(int quantity) {
	this.quantity = quantity;
    }

    public float getPrice() {
	return price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

}
