package net.foodordering.v1.common.bean;

public class CityBean {

    private Integer id;
    private String nameAr;
    private String nameEn;
    private String name;

    public CityBean(String nameAr, String nameEn, String name) {
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.name = name;
    }

    public CityBean() {
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

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

}
