package com.example.demo;

import java.util.List;

public interface CarService {
	void save(Car car);
	void modify(Car car);
	void deleteById(int id);
	Car selectById(int id);
	List<Car>selectAllEmployee();

}
