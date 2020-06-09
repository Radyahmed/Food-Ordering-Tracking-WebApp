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
@Table(name = "product")
public class Product implements java.io.Serializable {

    private static final long serialVersionUID = -5924339696228904653L;
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Category category;
    @Column(name = "name_ar", nullable = false, length = 50)
    private String nameAr;
    @Column(name = "name_en", nullable = false, length = 50)
    private String nameEn;
    @Column(name = "description_ar")
    private String descriptionAr;
    @Column(name = "description_en")
    private String descriptionEn;
    @Column(name = "price", nullable = false, precision = 12, scale = 0)
    private float price;
    @Column(name = "active", nullable = false)
    private byte active;
    @Column(name = "image_path")
    private String imagePath;
    @OneToMany(mappedBy = "product")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<OrderItem> orderItems = new HashSet<>(0);

    public Product() {
    }

    public Product(Category category, String nameAr, String nameEn, float price, byte active) {
	this.category = category;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.price = price;
	this.active = active;
    }

    public Product(Category category, String nameAr, String nameEn, String descriptionAr, String descriptionEn, float price, byte active, String imagePath, Set<OrderItem> orderItems) {
	this.category = category;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.descriptionAr = descriptionAr;
	this.descriptionEn = descriptionEn;
	this.price = price;
	this.active = active;
	this.imagePath = imagePath;
	this.orderItems = orderItems;
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Category getCategory() {
	return this.category;
    }

    public void setCategory(Category category) {
	this.category = category;
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

    public float getPrice() {
	return this.price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

    public byte getActive() {
	return this.active;
    }

    public void setActive(byte active) {
	this.active = active;
    }

    public String getImagePath() {
	return this.imagePath;
    }

    public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
    }

    public Set<OrderItem> getOrderItems() {
	return this.orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
	this.orderItems = orderItems;
    }

}
