package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
import com.example.demo.repository.Bookrepository;



@RestController

public class Bookcontroller {
	@Autowired
	public Bookrepository mrepo;
	
	
	@PostMapping("/addbook")
	public Bookentity addBook(@RequestBody Bookentity mov) {
		try {
			mrepo.save(mov);
			return mov;
		}catch(Exception e) {
		 e.printStackTrace();
		 
		}
		return null;
	}
	@PutMapping("/updatebook")
	public Bookentity uppdatemovie(@RequestBody Bookentity mov) {
		try {
			mrepo.save(mov);
			return mov;
		}catch(Exception e) {
		 e.printStackTrace();
		}
		return null;
	}
	@GetMapping("/getbook")
	public List<Bookentity> getmovie() {
		try {
			
			return mrepo.findAll();
		}catch(Exception e) {
		 e.printStackTrace();
		}
		return null;
	}
	@DeleteMapping("/deletebook/{Id}")
	public String deletemovie(@PathVariable int Id) {
		try {
			Bookentity mov = mrepo.getOne(Id);
			mrepo.delete(mov);
			return "movie deleted";
		}catch(Exception e) {
		 e.printStackTrace();
		}
		return null;
	}
	
	

}
