package com.example.demo.repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bookentity;



@SpringBootApplication
@Repository
public interface Bookrepository extends JpaRepository<Bookentity,Integer>{
	
}
