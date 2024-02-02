package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@PostMapping("/cars")
	public ResponseEntity<Car>saveCar(@RequestBody Car car)
	{
		Car c= carService.saveCar(car);
		return new ResponseEntity<Car>(c,HttpStatus.CREATED);
	}
	
	@GetMapping("/cars")
	public ResponseEntity<List<Car>>getAllCar()
	{
		List<Car> c= carService.getAllCar();
		return new ResponseEntity<List<Car>>(c,HttpStatus.OK);
	}
	
	
	@GetMapping("/cars/{id}")
	public ResponseEntity<Car>getCarById(@PathVariable int id)
	{
    Car c=carService.getCarById(id);
    
    	 return new ResponseEntity<Car>(c,HttpStatus.OK);
    	 
	}
     
    	 
     
	@PutMapping("/cars/{id}")
	public ResponseEntity<Car>updateCar(@RequestBody Car car ,@PathVariable int id)
	{
		car.setId(id);
		Car c=carService.updateCar(car);
	    
	    	 return new ResponseEntity<Car>(c,HttpStatus.OK);
	     }
	     

	@DeleteMapping("/cars/{id}")
	public ResponseEntity<Void>deleteCar(@PathVariable int id)
	{
		carService.deleteCar(id);
	     
	    	 return new ResponseEntity<Void>(HttpStatus.OK);
	    
	}
		
	}
