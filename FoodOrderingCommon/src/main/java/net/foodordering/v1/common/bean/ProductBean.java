package net.foodordering.v1.common.bean;

public class ProductBean {

    private Integer id;
    private String nameAr;
    private String nameEn;
    private String descriptionAr;
    private String descriptionEn;
    private String imagePath;
    private float price;
    private byte active;

    public ProductBean() {
    }

    public ProductBean(Integer id, String nameAr, String nameEn, String descriptionAr, String descriptionEn, String imagePath, float price, byte active) {
	this.id = id;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.descriptionAr = descriptionAr;
	this.descriptionEn = descriptionEn;
	this.imagePath = imagePath;
	this.price = price;
	this.active = active;
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

    public String getImagePath() {
	return imagePath;
    }

    public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
    }

    public float getPrice() {
	return price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

    public byte getActive() {
	return active;
    }

    public void setActive(byte active) {
	this.active = active;
    }

}
