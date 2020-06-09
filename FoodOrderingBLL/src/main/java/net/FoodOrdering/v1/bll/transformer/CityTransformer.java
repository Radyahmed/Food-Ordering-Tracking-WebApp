package net.FoodOrdering.v1.bll.transformer;

import net.foodordering.v1.common.bean.CityBean;
import net.foodordering.v1.common.constant.RadyConstant;
import net.foodordering.v1.dal.entity.annotation.City;

public class CityTransformer implements RadyConstant, CommonTransformer<City, CityBean> {

    @Override
    public CityBean transformEntityToBean(City cityEnCity, String lang) {
	CityBean cityBean = new CityBean();
	cityBean.setId(cityEnCity.getId());
	cityBean.setNameAr(cityEnCity.getNameAr());
	cityBean.setNameEn(cityEnCity.getNameEn());
	if (LANG_AR.equals(lang)) {
	    cityBean.setName(cityEnCity.getNameAr());
	} else {
	    cityBean.setName(cityEnCity.getNameEn());
	}
	return cityBean;
    }

    @Override
    public City transformBeanToEntity(CityBean cityBean) {
	City city = new City();
	city.setId(cityBean.getId());
	city.setNameAr(cityBean.getNameAr());
	city.setNameEn(cityBean.getNameEn());
	return city;
    }
}
