package net.FoodOrdering.v1.bll;

import java.util.List;
import net.FoodOrdering.v1.bll.manager.*;
import net.FoodOrdering.v1.bll.manager.impl.LookupsManagerImpl;
import net.FoodOrdering.v1.bll.manager.impl.MenuMangerImpl;
import net.foodordering.v1.common.bean.AreaBean;
import net.foodordering.v1.common.bean.CityBean;
import net.foodordering.v1.common.bean.ProductBean;

public class FoodOrderingBLGateway {

    private MenuManager menuManager = new MenuMangerImpl();
    private LookupsManager lookupsManager = new LookupsManagerImpl();

    public ProductBean addProduct(ProductBean product) {
	return menuManager.addProduct(product);
    }

    public CityBean addCity(CityBean cityBean) {
	return lookupsManager.addCity(cityBean);
    }

    public CityBean updateCity(CityBean cityBean) {
	return lookupsManager.updateCity(cityBean);
    }

    public void removeCity(Integer id) {
	lookupsManager.removeCity(id);
    }

    public CityBean findCityById(Integer id) {
	return lookupsManager.findCityById(id);
    }

    public List<CityBean> findListOfCities() {
	return lookupsManager.findListOfCities();
    }

    public AreaBean addArea(AreaBean areaBean) {
	return lookupsManager.addArea(areaBean);
    }

    public AreaBean updateArea(AreaBean areaBean) {
	return lookupsManager.updateArea(areaBean);
    }

    public void removeArea(Integer id) {
	lookupsManager.removeArea(id);
    }

    public AreaBean findAreaById(Integer id) {
	return lookupsManager.findAreaById(id);
    }

    public List<AreaBean> findListOfAreaes() {
	return lookupsManager.findListOfAreaes();
    }

}
