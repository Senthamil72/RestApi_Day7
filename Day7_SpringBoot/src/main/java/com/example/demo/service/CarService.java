package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
@Autowired
CarRepo sr;
public Car adddet(Car ss)
{
	return sr.save(ss);
}
public List<Car> show()
{
	return sr.findAll();
}
public List<Car> getcar(int owners)
{
	return sr.getStudentInfo(owners);
}
public List<Car> getcaraddress(String address)
{
	return sr.getStudentaddress(address);
}
public List<Car> getcarnname(String carname)
{
	return sr.getcarname(carname);
}
public List<Car> getowntype(String own,String cartype)
{
	return sr.getcarowntype(own, cartype);
}

}
