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
@Table(name = "provider")
public class Provider implements java.io.Serializable {

    private static final long serialVersionUID = 6724461217695554825L;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "name_ar", unique = true, nullable = false, length = 50)
    private String nameAr;
    @Column(name = "name_en", unique = true, nullable = false, length = 50)
    private String nameEn;
    @Column(name = "hotline", length = 20)
    private String hotline;
    @Column(name = "logo_path_ar")
    private String logoPathAr;
    @Column(name = "logo_path_en")
    private String logoPathEn;
    @OneToMany(mappedBy = "provider")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Category> categories = new HashSet<>(0);
    @OneToMany(mappedBy = "provider")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Branch> branches = new HashSet<>(0);
    @OneToMany(mappedBy = "provider")
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<ProviderUser> providerUsers = new HashSet<>(0);

    public Provider() {
    }

    public Provider(String nameAr, String nameEn) {
	this.nameAr = nameAr;
	this.nameEn = nameEn;
    }

    public Provider(String nameAr, String nameEn, String hotline, String logoPathAr, String logoPathEn, Set<Category> categories, Set<Branch> branches, Set<ProviderUser> providerUsers) {
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.hotline = hotline;
	this.logoPathAr = logoPathAr;
	this.logoPathEn = logoPathEn;
	this.categories = categories;
	this.branches = branches;
	this.providerUsers = providerUsers;
    }

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
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

    public String getHotline() {
	return this.hotline;
    }

    public void setHotline(String hotline) {
	this.hotline = hotline;
    }

    public String getLogoPathAr() {
	return this.logoPathAr;
    }

    public void setLogoPathAr(String logoPathAr) {
	this.logoPathAr = logoPathAr;
    }

    public String getLogoPathEn() {
	return this.logoPathEn;
    }

    public void setLogoPathEn(String logoPathEn) {
	this.logoPathEn = logoPathEn;
    }

    public Set<Category> getCategories() {
	return this.categories;
    }

    public void setCategories(Set<Category> categories) {
	this.categories = categories;
    }

    public Set<Branch> getBranches() {
	return this.branches;
    }

    public void setBranches(Set<Branch> branches) {
	this.branches = branches;
    }

    public Set<ProviderUser> getProviderUsers() {
	return this.providerUsers;
    }

    public void setProviderUsers(Set<ProviderUser> providerUsers) {
	this.providerUsers = providerUsers;
    }

}
