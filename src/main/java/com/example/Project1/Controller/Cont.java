package com.example.Project1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project1.Entity.Ent;
import com.example.Project1.Services.Serve;
@CrossOrigin
@RestController
public class Cont {
	
		@Autowired
		Serve stuService;
		@PostMapping("/add1Details")
		public Ent addInfo(@RequestBody Ent st) {
			return stuService.saveDetails(st);
		}
		@GetMapping("show1Details")
		public List<Ent> fetchDetails()
		{
			return stuService.getDetails();
		}
		@PutMapping("/update1Details")
		public Ent updateInfo(@RequestBody Ent st1)
		{
			return stuService.updateDetails(st1);
		}
	    @DeleteMapping("/delete/{bid}")
	    public String deleteInfo(@PathVariable("bid") int bid)
	    {
	    	stuService.deleteDetails(bid);
	    	return "Deleted details";
	    }
	    @PostMapping("/post")
	    public String addDetails(@RequestBody Ent m)
	    {
	    	stuService.add(m);
	    	return "Added product " +m.getBid();
	    }
	    
	    @GetMapping("/product/{field}")
	    public List<Ent> getWithSort(@PathVariable String field)
	    {
	    	return stuService.getSorted(field);
	    }
	    
	    @GetMapping("/product/{offset}/{pageSize}")
	    public List<Ent> productsWithPagination(@PathVariable int offset,@PathVariable int pageSize)
	    {
	    	return stuService.getWithPagination(offset,pageSize);
	    }
	    @GetMapping("/s")
	    public List<Ent> displayAllBat()
	    {
	    	return stuService.allBat();
	    }
	    @GetMapping("showBat")
	    public List<Ent> BatDet()
	    {
	    	return stuService.getUserInfo();
	    }
	    @GetMapping("showSpecbat/{bid}")
	    public List<Ent> SpecifiedBatDetails(@PathVariable("b") int bid)
	    {
	    	return stuService.getparticularBat(bid);
	    }
	    @GetMapping("showBatBy/{bid}/{bname}")
	    public List<Ent> BatDetBy (@PathVariable("b") int bid,@PathVariable("bn") String bname)
	    {
	    	return stuService.getBatBy(bid,bname);
	    }
	}

