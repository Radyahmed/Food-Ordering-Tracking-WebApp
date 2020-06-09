package net.foodordering.v1.common.bean;

public class DeliveryAreaBean {

    private Integer id;
    private float deliveryFees;
    private int deliveryInMinutes;

    public DeliveryAreaBean() {
    }

    public DeliveryAreaBean(Integer id, float deliveryFees, int deliveryInMinutes) {
	this.id = id;
	this.deliveryFees = deliveryFees;
	this.deliveryInMinutes = deliveryInMinutes;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public float getDeliveryFees() {
	return deliveryFees;
    }

    public void setDeliveryFees(float deliveryFees) {
	this.deliveryFees = deliveryFees;
    }

    public int getDeliveryInMinutes() {
	return deliveryInMinutes;
    }

    public void setDeliveryInMinutes(int deliveryInMinutes) {
	this.deliveryInMinutes = deliveryInMinutes;
    }

}
