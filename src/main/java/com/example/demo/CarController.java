package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	@Autowired
	private CarService carService;
	
	@PostMapping("/car")
	public String saveCar(@RequestBody Car car)
	{
		carService.save(car);
		return "added suucessfully";
	}
	
	
	@GetMapping("/car")
	public List<Car> getAllEmployee()
	{
		return carService.selectAllEmployee();
		
	}
	
	
	@GetMapping("/car/{id}")
	public Car getEmployeeById(@PathVariable int id)
	{
		return carService.selectById(id);
	}
	
	@PutMapping("/car/{id}")
	public  String updateCar(@RequestBody Car car)
	{
		carService.modify(car);
		return"successfully updated";
	}
	
	@DeleteMapping(value= {"/car"})
	public String deleteCar(@RequestParam int id)
	{
		carService.deleteById(id);
		return "deleted";
	}
	
	@DeleteMapping("/car/{id}")
	public String deleteCar1(@PathVariable int id)
	{
		carService.deleteById(id);
		return "deleted";
	}
}
