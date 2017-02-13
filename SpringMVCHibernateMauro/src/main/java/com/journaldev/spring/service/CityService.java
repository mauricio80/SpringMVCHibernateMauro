package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.City;

public interface CityService {
	public void addCity(City c);
	public void updateCity(City c);
	public List<City> listCities();
	public City getCityById(int id);
	public void removeCity(int id);
}
