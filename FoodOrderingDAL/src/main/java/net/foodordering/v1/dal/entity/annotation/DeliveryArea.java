package net.foodordering.v1.dal.entity.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "delivery_area")

public class DeliveryArea implements java.io.Serializable {

    private static final long serialVersionUID = -9106138216375272794L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Area area;
    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Branch branch;
    @Column(name = "delivery_fees", nullable = false, precision = 12, scale = 0)
    private float deliveryFees;
    @Column(name = "delivery_in_minutes", nullable = false)
    private int deliveryInMinutes;

    public DeliveryArea() {
    }

    public DeliveryArea(Area area, Branch branch, float deliveryFees, int deliveryInMinutes) {
	this.area = area;
	this.branch = branch;
	this.deliveryFees = deliveryFees;
	this.deliveryInMinutes = deliveryInMinutes;
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Area getArea() {
	return this.area;
    }

    public void setArea(Area area) {
	this.area = area;
    }

    public Branch getBranch() {
	return this.branch;
    }

    public void setBranch(Branch branch) {
	this.branch = branch;
    }

    public float getDeliveryFees() {
	return this.deliveryFees;
    }

    public void setDeliveryFees(float deliveryFees) {
	this.deliveryFees = deliveryFees;
    }

    public int getDeliveryInMinutes() {
	return this.deliveryInMinutes;
    }

    public void setDeliveryInMinutes(int deliveryInMinutes) {
	this.deliveryInMinutes = deliveryInMinutes;
    }

}
