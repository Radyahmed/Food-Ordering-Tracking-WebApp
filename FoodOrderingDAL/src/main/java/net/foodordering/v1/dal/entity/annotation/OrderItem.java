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
@Table(name = "order_item")
public class OrderItem implements java.io.Serializable {

    private static final long serialVersionUID = -1518785781723150422L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Product product;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Column(name = "price", nullable = false, precision = 12, scale = 0)
    private float price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, int quantity, float price) {
	this.order = order;
	this.product = product;
	this.quantity = quantity;
	this.price = price;
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Order getOrder() {
	return this.order;
    }

    public void setOrder(Order order) {
	this.order = order;
    }

    public Product getProduct() {
	return this.product;
    }

    public void setProduct(Product product) {
	this.product = product;
    }

    public int getQuantity() {
	return this.quantity;
    }

    public void setQuantity(int quantity) {
	this.quantity = quantity;
    }

    public float getPrice() {
	return this.price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

}
