package net.foodordering.v1.dal.entity.annotation;

import java.math.BigDecimal;
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
@Table(name = "branch")
public class Branch implements java.io.Serializable {

    private static final long serialVersionUID = 1036317132208421828L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "area_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Area area;
    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Provider provider;
    @Column(name = "name_ar", nullable = false, length = 50)
    private String nameAr;
    @Column(name = "name_en", nullable = false, length = 50)
    private String nameEn;
    @Column(name = "phone", length = 20)
    private String phone;
    @Column(name = "lat", nullable = false, precision = 10, scale = 8)
    private BigDecimal lat;
    @Column(name = "lng", nullable = false, precision = 11, scale = 8)
    private BigDecimal lng;
    @Temporal(TemporalType.TIME)
    @Column(name = "open_at", nullable = false, length = 8)
    private Date openAt;
    @Temporal(TemporalType.TIME)
    @Column(name = "close_at", nullable = false, length = 8)
    private Date closeAt;
    @OneToMany(mappedBy = "branch")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<DeliveryArea> deliveryAreas = new HashSet<DeliveryArea>(0);
    @OneToMany(mappedBy = "branch")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<ProviderUser> providerUsers = new HashSet<ProviderUser>(0);
    @OneToMany(mappedBy = "branch")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Order> orders = new HashSet<Order>(0);

    public Branch() {
    }

    public Branch(Area area, Provider provider, String nameAr, String nameEn, BigDecimal lat, BigDecimal lng, Date openAt, Date closeAt) {
	this.area = area;
	this.provider = provider;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.lat = lat;
	this.lng = lng;
	this.openAt = openAt;
	this.closeAt = closeAt;
    }

    public Branch(Area area, Provider provider, String nameAr, String nameEn, String phone, BigDecimal lat, BigDecimal lng, Date openAt, Date closeAt, Set<DeliveryArea> deliveryAreas, Set<ProviderUser> providerUsers, Set<Order> orders) {
	this.area = area;
	this.provider = provider;
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.phone = phone;
	this.lat = lat;
	this.lng = lng;
	this.openAt = openAt;
	this.closeAt = closeAt;
	this.deliveryAreas = deliveryAreas;
	this.providerUsers = providerUsers;
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

    public String getPhone() {
	return this.phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
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

    public Date getOpenAt() {
	return this.openAt;
    }

    public void setOpenAt(Date openAt) {
	this.openAt = openAt;
    }

    public Date getCloseAt() {
	return this.closeAt;
    }

    public void setCloseAt(Date closeAt) {
	this.closeAt = closeAt;
    }

    public Set<DeliveryArea> getDeliveryAreas() {
	return this.deliveryAreas;
    }

    public void setDeliveryAreas(Set<DeliveryArea> deliveryAreas) {
	this.deliveryAreas = deliveryAreas;
    }

    public Set<ProviderUser> getProviderUsers() {
	return this.providerUsers;
    }

    public void setProviderUsers(Set<ProviderUser> providerUsers) {
	this.providerUsers = providerUsers;
    }

    public Set<Order> getOrders() {
	return this.orders;
    }

    public void setOrders(Set<Order> orders) {
	this.orders = orders;
    }

}
