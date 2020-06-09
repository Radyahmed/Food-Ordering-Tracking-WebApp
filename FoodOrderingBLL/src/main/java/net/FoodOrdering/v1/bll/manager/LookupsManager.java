package net.FoodOrdering.v1.bll.manager;

import java.util.List;
import net.foodordering.v1.common.bean.AreaBean;
import net.foodordering.v1.common.bean.CityBean;

// lookups mean data stored in database and in manytimes i use it to read data from database 
// city and area table are our lockups in this system till now
public interface LookupsManager {

    public CityBean addCity(CityBean cityBean);

    public CityBean updateCity(CityBean cityBean);

    public void removeCity(Integer id);

    public CityBean findCityById(Integer id);

    public List<CityBean> findListOfCities();

    public AreaBean addArea(AreaBean areaBean);

    public AreaBean updateArea(AreaBean areaBean);

    public void removeArea(Integer id);

    public AreaBean findAreaById(Integer id);

    public List<AreaBean> findListOfAreaes();

}
