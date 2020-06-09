package net.foodordering.v1.common.bean;

public class CategoryBean {

    private Integer id;
    private String nameAr;
    private String nameEn;
    private String descriptionAr;
    private String descriptionEn;

    public CategoryBean() {
    }

    public CategoryBean(Integer id, String nameAr, String nameEn, String descriptionAr, String descriptionEn) {
	this.id = id;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.descriptionAr = descriptionAr;
	this.descriptionEn = descriptionEn;
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

    public String getDescriptionAr() {
	return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
	this.descriptionAr = descriptionAr;
    }

    public String getDescriptionEn() {
	return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
	this.descriptionEn = descriptionEn;
    }

}
