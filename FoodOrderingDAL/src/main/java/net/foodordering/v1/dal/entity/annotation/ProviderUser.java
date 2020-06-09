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
@Table(name = "provider_user")
public class ProviderUser implements java.io.Serializable {

    private static final long serialVersionUID = -7657892063151589336L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)

    private Integer id;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    @LazyCollection(LazyCollectionOption.FALSE)

    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    @LazyCollection(LazyCollectionOption.FALSE)

    private Provider provider;

    @Column(name = "user_name", unique = true, nullable = false, length = 50)

    private String userName;

    @Column(name = "password", nullable = false)

    private String password;

    @Column(name = "active")

    private Byte active;

    public ProviderUser() {
    }

    public ProviderUser(Provider provider, String userName, String password) {
	this.provider = provider;
	this.userName = userName;
	this.password = password;
    }

    public ProviderUser(Branch branch, Provider provider, String userName, String password, Byte active) {
	this.branch = branch;
	this.provider = provider;
	this.userName = userName;
	this.password = password;
	this.active = active;
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Branch getBranch() {
	return this.branch;
    }

    public void setBranch(Branch branch) {
	this.branch = branch;
    }

    public Provider getProvider() {
	return this.provider;
    }

    public void setProvider(Provider provider) {
	this.provider = provider;
    }

    public String getUserName() {
	return this.userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    public String getPassword() {
	return this.password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Byte getActive() {
	return this.active;
    }

    public void setActive(Byte active) {
	this.active = active;
    }

}
