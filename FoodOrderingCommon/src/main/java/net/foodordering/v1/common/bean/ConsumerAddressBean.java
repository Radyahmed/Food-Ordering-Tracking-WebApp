package net.foodordering.v1.common.bean;

import java.math.BigDecimal;

public class ConsumerAddressBean {

    private Integer id;
    private String street;
    private String building;
    private String floor;
    private String flat;
    private String landmark;
    private BigDecimal lat;
    private BigDecimal lng;
    private byte active;
    private String label;

    public ConsumerAddressBean() {
    }

    public ConsumerAddressBean(Integer id, String street, String building, String floor, String flat, String landmark, BigDecimal lat, BigDecimal lng, byte active, String label) {
	this.id = id;
	this.street = street;
	this.building = building;
	this.floor = floor;
	this.flat = flat;
	this.landmark = landmark;
	this.lat = lat;
	this.lng = lng;
	this.active = active;
	this.label = label;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getBuilding() {
	return building;
    }

    public void setBuilding(String building) {
	this.building = building;
    }

    public String getFloor() {
	return floor;
    }

    public void setFloor(String floor) {
	this.floor = floor;
    }

    public String getFlat() {
	return flat;
    }

    public void setFlat(String flat) {
	this.flat = flat;
    }

    public String getLandmark() {
	return landmark;
    }

    public void setLandmark(String landmark) {
	this.landmark = landmark;
    }

    public BigDecimal getLat() {
	return lat;
    }

    public void setLat(BigDecimal lat) {
	this.lat = lat;
    }

    public BigDecimal getLng() {
	return lng;
    }

    public void setLng(BigDecimal lng) {
	this.lng = lng;
    }

    public byte getActive() {
	return active;
    }

    public void setActive(byte active) {
	this.active = active;
    }

    public String getLabel() {
	return label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

}
