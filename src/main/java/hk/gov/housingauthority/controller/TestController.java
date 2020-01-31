package hk.gov.housingauthority.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import hk.gov.housingauthority.dao.CityMapper;
import hk.gov.housingauthority.entity.City;

@Controller
public class TestController {

	@Autowired
	SqlSessionFactory factory;

	@GetMapping(value = "/test")
	public String test() {
		System.out.println("why why why");
		try (SqlSession session = factory.openSession()) {
			CityMapper mapper = session.getMapper(CityMapper.class);
			List<City> cities = mapper.selectAllCities();
			System.out.println(cities.size());
		}

		return "home";
	}
}
