package net.foodordering.v1.dal.entity.annotation;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "category")
public class Category implements java.io.Serializable {

    private static final long serialVersionUID = 2302233041176565625L;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Provider provider;
    @Column(name = "name_ar", nullable = false, length = 50)
    private String nameAr;
    @Column(name = "name_en", nullable = false, length = 50)
    private String nameEn;
    @Column(name = "description_ar")
    private String descriptionAr;
    @Column(name = "description_en")
    private String descriptionEn;
    @OneToMany(mappedBy = "category")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Product> products = new HashSet<Product>(0);

    public Category() {
    }

    public Category(Provider provider, String nameAr, String nameEn) {
	this.provider = provider;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
    }

    public Category(Provider provider, String nameAr, String nameEn, String descriptionAr, String descriptionEn, Set<Product> products) {
	this.provider = provider;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.descriptionAr = descriptionAr;
	this.descriptionEn = descriptionEn;
	this.products = products;
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Provider getProvider() {
	return this.provider;
    }

    public void setProvider(Provider provider) {
	this.provider = provider;
    }

    public String getNameAr() {
	return this.nameAr;
    }

    public void setNameAr(String nameAr) {
	this.nameAr = nameAr;
    }

    public String getNameEn() {
	return this.nameEn;
    }

    public void setNameEn(String nameEn) {
	this.nameEn = nameEn;
    }

    public String getDescriptionAr() {
	return this.descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
	this.descriptionAr = descriptionAr;
    }

    public String getDescriptionEn() {
	return this.descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
	this.descriptionEn = descriptionEn;
    }

    public Set<Product> getProducts() {
	return this.products;
    }

    public void setProducts(Set<Product> products) {
	this.products = products;
    }

}
