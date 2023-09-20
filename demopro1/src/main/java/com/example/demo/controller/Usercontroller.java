package com.example.demo.controller;
import com.example.demo.entity.Userentity;
import com.example.demo.repositary.Userrepo;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController

public class Usercontroller {
	@Autowired
	public Userrepo repo;
	@PostMapping("/adduser")
	public Userentity addData(@RequestBody Userentity user) {
		try {
			repo.save(user);
			return user;
		}catch(Exception e) {
			e.printStackTrace();
		}
	  return null;
	}
	
	@GetMapping("/getuser")
	public List<Userentity>get(){
		try {
			return repo.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		
		return null;
	}

	}
	@PutMapping("/update")
	public Userentity updateuser(@RequestBody Userentity user) {
		try {
			repo.save(user);
			return user;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

 @DeleteMapping("/getdele/id")
 public String del(@PathVariable int id) {
 @SuppressWarnings("deprecation")
 Userentity user =repo.getOne(id);
 repo.delete(user);
 return "Delete";
 }
}

	

