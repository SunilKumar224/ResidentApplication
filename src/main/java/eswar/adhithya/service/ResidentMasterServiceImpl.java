package eswar.adhithya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import eswar.adhithya.exceptions.ResourceNotFound;
import eswar.adhithya.model.ResidentMaster;
import eswar.adhithya.repositery.ResidentMasterDao;

@Service
public class ResidentMasterServiceImpl implements ResidentMasterService {

	@Autowired
	public ResidentMasterDao residentMasterDao;
	
	public ResidentMaster findById(int a)
	{
		return residentMasterDao.findById(a).orElseThrow(()->new ResourceNotFound("didn't have record with ID "+a));
	}
	public List<ResidentMaster> findAll()
	
	{
		List<ResidentMaster> rList=new ArrayList();
		rList=(List<ResidentMaster>) residentMasterDao.findAll();
		  System.out.println("all data is "+rList);
		  return rList;
	}
	
	public void save(ResidentMaster r)
	{
		residentMasterDao.save(r);
	}
}
