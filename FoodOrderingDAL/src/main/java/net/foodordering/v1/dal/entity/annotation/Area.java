package net.foodordering.v1.dal.entity.annotation;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "area")
public class Area implements java.io.Serializable {

    private static final long serialVersionUID = 2671775784857343342L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private City city;
    @Column(name = "name_ar", nullable = false, length = 50)
    private String nameAr;
    @Column(name = "name_en", nullable = false, length = 50)
    private String nameEn;
    @OneToMany(mappedBy = "area")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<ConsumerAddress> consumerAddresses = new HashSet<ConsumerAddress>(0);
    @OneToMany(mappedBy = "area")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<DeliveryArea> deliveryAreas = new HashSet<DeliveryArea>(0);
    @OneToMany(mappedBy = "area")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Order> orders = new HashSet<Order>(0);
    @OneToMany(mappedBy = "area")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Branch> branches = new HashSet<Branch>(0);

    public Area() {
    }

    public Area(City city, String nameAr, String nameEn) {
	this.city = city;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
    }

    public Area(City city, String nameAr, String nameEn, Set<ConsumerAddress> consumerAddresses, Set<DeliveryArea> deliveryAreas, Set<Order> orders, Set<Branch> branches) {
	this.city = city;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.consumerAddresses = consumerAddresses;
	this.deliveryAreas = deliveryAreas;
	this.orders = orders;
	this.branches = branches;
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public City getCity() {
	return this.city;
    }

    public void setCity(City city) {
	this.city = city;
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

    public Set<ConsumerAddress> getConsumerAddresses() {
	return this.consumerAddresses;
    }

    public void setConsumerAddresses(Set<ConsumerAddress> consumerAddresses) {
	this.consumerAddresses = consumerAddresses;
    }

    public Set<DeliveryArea> getDeliveryAreas() {
	return this.deliveryAreas;
    }

    public void setDeliveryAreas(Set<DeliveryArea> deliveryAreas) {
	this.deliveryAreas = deliveryAreas;
    }

    public Set<Order> getOrders() {
	return this.orders;
    }

    public void setOrders(Set<Order> orders) {
	this.orders = orders;
    }

    public Set<Branch> getBranches() {
	return this.branches;
    }

    public void setBranches(Set<Branch> branches) {
	this.branches = branches;
    }

}
