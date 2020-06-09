package net.foodordering.v1.dal.repo;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import static net.foodordering.v1.dal.DBConnectionManager.getCurrentSession;
import net.foodordering.v1.dal.entity.annotation.City;
import org.hibernate.query.Query;

public class CityRepo extends AbstractEntityRepo<City> {

    public CityRepo() {
	super(City.class);
    }

    public List<City> findlikearabic(String pattern) {

	CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
	CriteriaQuery<City> cityCriteriaQuery = builder.createQuery(City.class);
	Root<City> root = cityCriteriaQuery.from(City.class);
	cityCriteriaQuery.select(root).where(builder.like(root.get("nameAr"), "%" + pattern + "%"));
	cityCriteriaQuery.orderBy(builder.asc(root.get("id")));
	Query<City> cityQuery = getCurrentSession().createQuery(cityCriteriaQuery);
	List<City> resultList = cityQuery.getResultList();
	return resultList;

    }

    public List<City> findlikeenglish(String pattern) {

	CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
	CriteriaQuery<City> cityCriteriaQuery = builder.createQuery(City.class);
	Root<City> root = cityCriteriaQuery.from(City.class);
	cityCriteriaQuery.select(root).where(builder.like(root.get("nameEn"), "%" + pattern + "%"));
	cityCriteriaQuery.orderBy(builder.asc(root.get("id")));
	Query<City> cityQuery = getCurrentSession().createQuery(cityCriteriaQuery);
	List<City> resultList = cityQuery.getResultList();
	return resultList;

    }

    public Boolean isfoundarabic(String pattern) {
	CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
	CriteriaQuery<City> cityCriteriaQuery = builder.createQuery(City.class);
	Root<City> root = cityCriteriaQuery.from(City.class);
	cityCriteriaQuery.select(root).where(builder.like(root.get("nameAr"), pattern));
	Query<City> cityQuery = getCurrentSession().createQuery(cityCriteriaQuery);
	City singleResult = cityQuery.getSingleResult();
	return singleResult.getId() != null;
    }

    public Boolean isfoundenglis(String pattern) {
	CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
	CriteriaQuery<City> cityCriteriaQuery = builder.createQuery(City.class);
	Root<City> root = cityCriteriaQuery.from(City.class);
	cityCriteriaQuery.select(root).where(builder.like(root.get("nameEn"), pattern));
	Query<City> cityQuery = getCurrentSession().createQuery(cityCriteriaQuery);
	City singleResult = cityQuery.getSingleResult();
	return singleResult.getId() != null;
    }

    public Long count() {

	CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
	CriteriaQuery<Long> cityCriteriaQuery = builder.createQuery(Long.class);
	Root<City> root = cityCriteriaQuery.from(City.class);
	cityCriteriaQuery.select(builder.count(root));
	Query<Long> countQuery = getCurrentSession().createQuery(cityCriteriaQuery);
	Long singleResult = countQuery.getSingleResult();
	return singleResult;
    }
}
