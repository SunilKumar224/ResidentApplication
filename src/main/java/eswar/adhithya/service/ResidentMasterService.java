package eswar.adhithya.service;

import java.util.List;

import org.springframework.stereotype.Service;

import eswar.adhithya.model.ResidentMaster;

@Service
public interface ResidentMasterService {
	
	public ResidentMaster findById(int a);
	public List<ResidentMaster> findAll();
	public void save(ResidentMaster r);

}
