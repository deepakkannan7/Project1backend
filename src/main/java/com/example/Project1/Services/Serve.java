package com.example.Project1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Project1.Entity.Ent;
import com.example.Project1.Repository.Rep;

@Service
public class Serve {
		@Autowired
		Rep stRepo;
		public Ent saveDetails(Ent e) {
			return stRepo.save(e);
		}
		public List<Ent> getDetails()
		{
			return stRepo.findAll();
		}
		public Ent updateDetails(Ent e1)
		{
			return stRepo.saveAndFlush(e1);
		}
	     public void deleteDetails(int id)
	     {
	    	 stRepo.deleteById(id);
	     }
	     
	     public String add(Ent m)
	     {
	    	 stRepo.save(m);
	    	 return "Added";
	     }
	     public List<Ent> getSorted(String field)
	     {
	    	 return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	     }
	     public List<Ent> getWithPagination(@PathVariable int offset,@PathVariable int pageSize)
	     {
	    	 Page<Ent> page=stRepo.findAll(PageRequest.of(offset, pageSize));
	    	 return page.getContent();
	     }
	     public List<Ent> allBat()
	     {
	    	 return stRepo.getBatInfo();
	     }
	     public List<Ent> getUserInfo()
	     {
	    	 return stRepo.getAllBat();
	     }
	     public List<Ent> getparticularBat(int bid)
	     {
	    	 return stRepo.getspecifiedBat(bid);
	     }
	     public List<Ent> getBatBy(int bid,String bname)
	     {
	    	 return stRepo.getBatbyIdName(bid, bname);
	     }
}
