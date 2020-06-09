package net.foodordering.v1.common.bean;

import java.math.BigDecimal;
import java.util.Date;

public class BranchBean {

    private Integer id;
    private String nameAr;
    private String nameEn;
    private String phone;
    private BigDecimal lat;
    private BigDecimal lng;
    private Date openAt;
    private Date closeAt;

    public BranchBean() {
    }

    public BranchBean(Integer id, String nameAr, String nameEn, String phone, BigDecimal lat, BigDecimal lng, Date openAt, Date closeAt) {
	this.id = id;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.phone = phone;
	this.lat = lat;
	this.lng = lng;
	this.openAt = openAt;
	this.closeAt = closeAt;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getNameAr() {
	return nameAr;
    }

    public void setNameAr(String nameAr) {
	this.nameAr = nameAr;
    }

    public String getNameEn() {
	return nameEn;
    }

    public void setNameEn(String nameEn) {
	this.nameEn = nameEn;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
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

    public Date getOpenAt() {
	return openAt;
    }

    public void setOpenAt(Date openAt) {
	this.openAt = openAt;
    }

    public Date getCloseAt() {
	return closeAt;
    }

    public void setCloseAt(Date closeAt) {
	this.closeAt = closeAt;
    }

}
