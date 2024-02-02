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
	public void  save(Car car)
	{
		carRepo.save(car);
	}
	
	@Override
	public void  modify(Car car)
	{
		carRepo.save(car);
	}

	
	@Override
	public void  deleteById(int id)
	{
		carRepo.deleteById(id);
	}

	@Override
	public Car  selectById(int id)
	{
		
		Optional<Car>c=carRepo.findById(id);
		if(c.isPresent())
		{
			return c.get();
		}
		return null;
	}
	
	@Override
	public List<Car> selectAllEmployee()
	{
		
		Iterable<Car>c=carRepo.findAll();
		List<Car>l=new ArrayList<Car>();
		c.forEach(ele->l.add(ele));
		return l;
}
}
