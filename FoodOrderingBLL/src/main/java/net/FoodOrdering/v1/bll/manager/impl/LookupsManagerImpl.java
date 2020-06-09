package net.FoodOrdering.v1.bll.manager.impl;

import java.util.ArrayList;
import java.util.List;
import net.FoodOrdering.v1.bll.manager.LookupsManager;
import net.FoodOrdering.v1.bll.transformer.CityTransformer;
import net.foodordering.v1.common.bean.AreaBean;
import net.foodordering.v1.common.bean.CityBean;
import net.foodordering.v1.common.constant.RadyConstant;
import static net.foodordering.v1.dal.DBConnectionManager.*;
import net.foodordering.v1.dal.entity.annotation.City;
import net.foodordering.v1.dal.repo.CityRepo;

public class LookupsManagerImpl implements LookupsManager, RadyConstant {

    private CityTransformer cityTransformer = new CityTransformer();
    private CityRepo cityRepo = new CityRepo();

    @Override
    public CityBean addCity(CityBean cityBean) {
	openSession();
	City cityEntity = cityTransformer.transformBeanToEntity(cityBean);
	beginTransaction();
	cityEntity = cityRepo.add(cityEntity);
	CityBean resultCityBean = cityTransformer.transformEntityToBean(cityEntity, LANG_AR);
	commitTransaction();
	return resultCityBean;

    }

    @Override
    public CityBean updateCity(CityBean cityBean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeCity(Integer id) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CityBean findCityById(Integer id) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CityBean> findListOfCities() {
	openSession();
	beginTransaction();
	List<City> cities = cityRepo.findList();
	List<CityBean> cityBeans = new ArrayList<>();
	for (City city : cities) {
	    CityBean resultCityBean = cityTransformer.transformEntityToBean(city, LANG_AR);
	    cityBeans.add(resultCityBean);
	}
	commitTransaction();
	return cityBeans;
    }

    @Override
    public AreaBean addArea(AreaBean areaBean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AreaBean updateArea(AreaBean areaBean) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeArea(Integer id) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AreaBean findAreaById(Integer id) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AreaBean> findListOfAreaes() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
