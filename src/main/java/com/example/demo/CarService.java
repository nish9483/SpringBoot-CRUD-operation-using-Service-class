package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface CarService {
	Car saveCar(Car car);
	
	List<Car> getAllCar();
	
	Car getCarById(int id);
	
	Car updateCar(Car car);
	
	void deleteCar(int id);

}
