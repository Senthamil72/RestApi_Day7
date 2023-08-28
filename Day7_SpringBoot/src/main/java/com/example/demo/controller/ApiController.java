package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
public class ApiController {
@Autowired
CarService sser;
@PostMapping("add")
public Car addndet(@RequestBody Car ss)
{
	return sser.adddet(ss);
}
@GetMapping("show")
public List<Car> showdded()
{
	return sser.show();
}
@GetMapping("owners/{name}")
public List<Car> showcardetails(@PathVariable int name)
{
	return sser.getcar(name);
}
@GetMapping("address/{name}")
public List<Car> showaddress(@PathVariable String name)
{
	return sser.getcaraddress(name);
}
@GetMapping("carname/{name}")
public List<Car> showcarnamedet(@PathVariable String name)
{
	return sser.getcarnname(name);
}
@GetMapping("owners/{own}/cartype/{type}")
public List<Car> showcarnamedet(@PathVariable String own,@PathVariable String type)
{
	return sser.getowntype(own,type);
}
}
