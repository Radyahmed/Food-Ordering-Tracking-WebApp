package net.foodordering.v1.dal.entity.annotation;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "city")
public class City implements java.io.Serializable {

    private static final long serialVersionUID = -2896194497105091544L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "name_ar", unique = true, nullable = false, length = 50)
    private String nameAr;
    @Column(name = "name_en", unique = true, nullable = false, length = 50)
    private String nameEn;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.TRUE)
    private Set<Area> areas = new HashSet<Area>(0);

    public City() {
    }

    public City(String nameAr, String nameEn) {
	this.nameAr = nameAr;
	this.nameEn = nameEn;
    }

    public City(String nameAr, String nameEn, Set<Area> areas) {
	this.nameAr = nameAr;
	this.nameEn = nameEn;
	this.areas = areas;
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
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

    public Set<Area> getAreas() {
	return this.areas;
    }

    public void setAreas(Set<Area> areas) {
	this.areas = areas;
    }

}
