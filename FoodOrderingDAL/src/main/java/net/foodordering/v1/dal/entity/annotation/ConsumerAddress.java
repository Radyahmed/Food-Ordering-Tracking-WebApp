package net.foodordering.v1.dal.entity.annotation;

import java.math.BigDecimal;
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
@Table(name = "consumer_address")
public class ConsumerAddress implements java.io.Serializable {

    private static final long serialVersionUID = 6394316912808736597L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Area area;
    @ManyToOne
    @JoinColumn(name = "consumer_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Consumer consumer;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "building", nullable = false)
    private String building;
    @Column(name = "floor", nullable = false)
    private String floor;
    @Column(name = "flat", nullable = false)
    private String flat;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "lat", precision = 10, scale = 8)
    private BigDecimal lat;
    @Column(name = "lng", precision = 11, scale = 8)
    private BigDecimal lng;
    @Column(name = "active", nullable = false)
    private byte active;
    @Column(name = "label", length = 50)
    private String label;
    @OneToMany(mappedBy = "consumerAddress")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Order> orders = new HashSet<Order>(0);

    public ConsumerAddress() {
    }

    public ConsumerAddress(Area area, Consumer consumer, String street, String building, String floor, String flat, byte active) {
	this.area = area;
	this.consumer = consumer;
	this.street = street;
	this.building = building;
	this.floor = floor;
	this.flat = flat;
	this.active = active;
    }

    public ConsumerAddress(Area area, Consumer consumer, String street, String building, String floor, String flat, String landmark, BigDecimal lat, BigDecimal lng, byte active, String label, Set<Order> orders) {
	this.area = area;
	this.consumer = consumer;
	this.street = street;
	this.building = building;
	this.floor = floor;
	this.flat = flat;
	this.landmark = landmark;
	this.lat = lat;
	this.lng = lng;
	this.active = active;
	this.label = label;
	this.orders = orders;
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

    public Consumer getConsumer() {
	return this.consumer;
    }

    public void setConsumer(Consumer consumer) {
	this.consumer = consumer;
    }

    public String getStreet() {
	return this.street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getBuilding() {
	return this.building;
    }

    public void setBuilding(String building) {
	this.building = building;
    }

    public String getFloor() {
	return this.floor;
    }

    public void setFloor(String floor) {
	this.floor = floor;
    }

    public String getFlat() {
	return this.flat;
    }

    public void setFlat(String flat) {
	this.flat = flat;
    }

    public String getLandmark() {
	return this.landmark;
    }

    public void setLandmark(String landmark) {
	this.landmark = landmark;
    }

    public BigDecimal getLat() {
	return this.lat;
    }

    public void setLat(BigDecimal lat) {
	this.lat = lat;
    }

    public BigDecimal getLng() {
	return this.lng;
    }

    public void setLng(BigDecimal lng) {
	this.lng = lng;
    }

    public byte getActive() {
	return this.active;
    }

    public void setActive(byte active) {
	this.active = active;
    }

    public String getLabel() {
	return this.label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

    public Set<Order> getOrders() {
	return this.orders;
    }

    public void setOrders(Set<Order> orders) {
	this.orders = orders;
    }

}
