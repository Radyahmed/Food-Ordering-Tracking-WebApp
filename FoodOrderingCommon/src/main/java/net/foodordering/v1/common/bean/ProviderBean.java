package net.foodordering.v1.common.bean;

public class ProviderBean {

    private int id;
    private String nameAr;
    private String nameEn;
    private String hotline;
    private String logoPathAr;
    private String logoPathEn;

    public ProviderBean() {
    }

    public ProviderBean(int id, String nameAr, String nameEn, String hotline, String logoPathAr, String logoPathEn) {
	this.id = id;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.hotline = hotline;
	this.logoPathAr = logoPathAr;
	this.logoPathEn = logoPathEn;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
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

    public String getHotline() {
	return hotline;
    }

    public void setHotline(String hotline) {
	this.hotline = hotline;
    }

    public String getLogoPathAr() {
	return logoPathAr;
    }

    public void setLogoPathAr(String logoPathAr) {
	this.logoPathAr = logoPathAr;
    }

    public String getLogoPathEn() {
	return logoPathEn;
    }

    public void setLogoPathEn(String logoPathEn) {
	this.logoPathEn = logoPathEn;
    }

}
