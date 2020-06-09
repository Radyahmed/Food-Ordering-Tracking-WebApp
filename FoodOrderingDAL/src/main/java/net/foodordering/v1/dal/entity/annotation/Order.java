package net.foodordering.v1.dal.entity.annotation;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "order")
public class Order implements java.io.Serializable {

    private static final long serialVersionUID = -890090511932477621L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Area area;
    @ManyToOne
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;
    @ManyToOne
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "consumer_id", unique = true)
    private Consumer consumer;
    @ManyToOne
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "consumer_address_id", nullable = false)
    private ConsumerAddress consumerAddress;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_at", nullable = false, length = 19)
    private Date orderAt;
    @Column(name = "delivery_fees", nullable = false, precision = 12, scale = 0)
    private float deliveryFees;
    @Column(name = "status", nullable = false, length = 50)
    private String status;
    @OneToMany(mappedBy = "order")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<OrderItem> orderItems = new HashSet<>(0);

    public Order() {
    }

    public Order(Area area, Branch branch, ConsumerAddress consumerAddress, Date orderAt, float deliveryFees, String status) {
	this.area = area;
	this.branch = branch;
	this.consumerAddress = consumerAddress;
	this.orderAt = orderAt;
	this.deliveryFees = deliveryFees;
	this.status = status;
    }

    public Order(Area area, Branch branch, Consumer consumer, ConsumerAddress consumerAddress, Date orderAt, float deliveryFees, String status, Set<OrderItem> orderItems) {
	this.area = area;
	this.branch = branch;
	this.consumer = consumer;
	this.consumerAddress = consumerAddress;
	this.orderAt = orderAt;
	this.deliveryFees = deliveryFees;
	this.status = status;
	this.orderItems = orderItems;
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

    public Consumer getConsumer() {
	return this.consumer;
    }

    public void setConsumer(Consumer consumer) {
	this.consumer = consumer;
    }

    public ConsumerAddress getConsumerAddress() {
	return this.consumerAddress;
    }

    public void setConsumerAddress(ConsumerAddress consumerAddress) {
	this.consumerAddress = consumerAddress;
    }

    public Date getOrderAt() {
	return this.orderAt;
    }

    public void setOrderAt(Date orderAt) {
	this.orderAt = orderAt;
    }

    public float getDeliveryFees() {
	return this.deliveryFees;
    }

    public void setDeliveryFees(float deliveryFees) {
	this.deliveryFees = deliveryFees;
    }

    public String getStatus() {
	return this.status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    public Set<OrderItem> getOrderItems() {
	return this.orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
	this.orderItems = orderItems;
    }

}
