package eswar.adhithya.controller;

import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import eswar.adhithya.model.Address;
import eswar.adhithya.model.ResidentMaster;
import eswar.adhithya.service.ResidentMasterService;

@RestController
@RequestMapping("/resident")
public class ResidentController {

	@Autowired
	public ResidentMasterService residentMasterService;
	
	List<ResidentMaster> residentList;
	
	@Autowired
	ResidentMaster residentMaster;
	
	@GetMapping(value="/getAllDetails")
	public List<ResidentMaster> getAll()
	{
		residentList= residentMasterService.findAll();
		System.out.println("resident data : "+residentList);
		return residentList;
	}
	
	@GetMapping(value="/get/{id}")
	public ResponseEntity<ResidentMaster> getId(@PathVariable(name="id") int id)
	{
		residentMaster =residentMasterService.findById(id);
		return new ResponseEntity(residentMaster, HttpStatus.ACCEPTED) ;
	}
	
	@PostMapping(value="/addResident")
	public void addingResident(@RequestBody ResidentMaster rs )
	{
		System.out.println("RS data :"+rs);
		ResidentMaster r=new ResidentMaster();
		r.setResidentName(rs.getResidentName());
		r.setResidentEmail(rs.getResidentEmail());
		r.setResidentPhone(rs.getResidentPhone());
		//r.setAddress(rs.getAddress());
				
		residentMasterService.save(r);
		
	}
}
