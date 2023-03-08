package com.example.Project1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Project1.Entity.Ent;
@Repository
public interface Rep extends JpaRepository<Ent,Integer> {
	
	@Query(value="select * from bat_details",nativeQuery=true)
	public List<Ent> getBatInfo();
	@Query(value="select * from bat_details",nativeQuery=true)
	public List<Ent> getAllBat();
	@Query(value="select * from bat_details where bid=:b",nativeQuery=true)
	public List<Ent> getspecifiedBat(@Param("b")int bid);
	@Query(value="select * from bat_details where bid=:b or bname=:bn",nativeQuery=true)
	public List<Ent> getBatbyIdName(@Param("b") int bid,@Param("bn")String bname);
//	@Query(value="select * from bat_details where bid=:b or bname=:bn",nativeQuery=true)
//	public List<Ent> conditionalEnt(@Param("b") int s,@Param("bn") String bn);
	}

