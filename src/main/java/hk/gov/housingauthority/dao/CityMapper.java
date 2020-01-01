package hk.gov.housingauthority.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import hk.gov.housingauthority.entity.City;

@Mapper
public interface CityMapper {
	
//	@Autowired
//	SqlSessionFactory factory;

//	SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
	
//	public List<City> getAllCities() {
//		SqlSession session = factory.openSession();
//		List<City> cityList = session.selectList("getAllCities");
//		System.out.println(Arrays.toString(cityList.toArray()));
//		session.commit();
//		session.close();
//		return cityList;
//	}
	
	@Select("SELECT * FROM world.city")
	List<City> selectAllCities();
}
