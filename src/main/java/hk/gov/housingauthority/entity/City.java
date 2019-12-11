package hk.gov.housingauthority.entity;

public class City {
	private Integer id;
	private String name;
	private String countryCode;
	private String distinct;
	private Integer population;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistinct() {
		return distinct;
	}
	public void setDistinct(String distinct) {
		this.distinct = distinct;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countryCode=" + countryCode + ", distinct=" + distinct
				+ ", population=" + population + "]";
	}
}
