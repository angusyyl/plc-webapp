package hk.gov.housingauthority.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import hk.gov.housingauthority.entity.City;
import hk.gov.housingauthority.util.MyBatisUtil;

@Repository
public class CityMapper {
	public List<City> getAllCities() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<City> cityList = session.selectList("getAllCities");
		session.commit();
		session.close();
		return cityList;
	}
}
