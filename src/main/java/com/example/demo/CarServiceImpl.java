package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepo carRepo;
	
	@Override
	public Car  saveCar(Car car)
	{
		return carRepo.save(car);
	}
	
	@Override
	public List<Car> getAllCar()
	{
		return carRepo.findAll();
	}

	
	@Override
	public Car getCarById(int id)
	{
		Optional<Car>c=carRepo.findById(id);
		return c.get();
	}

	@Override
	public Car updateCar(Car car)
	{
		Car ca=carRepo.findById(car.getId()).get();
		
		ca.setName(car.getName());
		ca.setModel(car.getModel());
		Car c=carRepo.save(ca);
		return c;
	}
		
	
	@Override
	public void deleteCar(int id) 
	{
		carRepo.deleteById(id);
		
	}
		
	}