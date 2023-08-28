package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
	
	@Query(value="select * from cartable where owners=:sn",nativeQuery=true)
	public List<Car>getStudentInfo(@Param("sn") int owners);
	
	@Query(value="select * from cartable where address=:sn",nativeQuery=true)
	public List<Car>getStudentaddress(@Param("sn") String address);

	@Query(value="select * from cartable where car_name=:sn",nativeQuery=true)
	public List<Car>getcarname(@Param("sn") String carname);
	
	@Query(value="select * from cartable where owners=:s and car_type=:sn",nativeQuery=true)
	public List<Car>getcarowntype(@Param("s") String own,@Param("sn") String cartype);

	
	
}

