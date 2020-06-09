package net.foodordering.v1.dal.entity.annotation;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "consumer")
public class Consumer implements java.io.Serializable {

    private static final long serialVersionUID = 8035115795654147896L;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "username", unique = true, nullable = false, length = 50)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "fullname", nullable = false)
    private String fullname;
    @Column(name = "phone", unique = true, nullable = false, length = 20)
    private String phone;
    @Column(name = "gender", length = 50)
    private String gender;
    @OneToMany(mappedBy = "consumer")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<ConsumerAddress> consumerAddresses = new HashSet<ConsumerAddress>(0);
    @OneToMany(mappedBy = "consumer")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Order> orders = new HashSet<Order>(0);

    public Consumer() {
    }

    public Consumer(String username, String password, String fullname, String phone) {
	this.username = username;
	this.password = password;
	this.fullname = fullname;
	this.phone = phone;
    }

    public Consumer(String username, String password, String fullname, String phone, String gender, Set<ConsumerAddress> consumerAddresses, Set<Order> orders) {
	this.username = username;
	this.password = password;
	this.fullname = fullname;
	this.phone = phone;
	this.gender = gender;
	this.consumerAddresses = consumerAddresses;
	this.orders = orders;
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getUsername() {
	return this.username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return this.password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getFullname() {
	return this.fullname;
    }

    public void setFullname(String fullname) {
	this.fullname = fullname;
    }

    public String getPhone() {
	return this.phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getGender() {
	return this.gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public Set<ConsumerAddress> getConsumerAddresses() {
	return this.consumerAddresses;
    }

    public void setConsumerAddresses(Set<ConsumerAddress> consumerAddresses) {
	this.consumerAddresses = consumerAddresses;
    }

    public Set<Order> getOrders() {
	return this.orders;
    }

    public void setOrders(Set<Order> orders) {
	this.orders = orders;
    }

}
