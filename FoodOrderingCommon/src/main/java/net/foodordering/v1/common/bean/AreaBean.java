package net.foodordering.v1.common.bean;

public class AreaBean {

    private Integer id;
    private String nameAr;
    private String nameEn;

    public AreaBean() {
    }

    public AreaBean(Integer id, String nameAr, String nameEn) {
	this.id = id;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
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

}
