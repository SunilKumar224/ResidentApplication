package eswar.adhithya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eswar.adhithya.model.Address;
import eswar.adhithya.repositery.AddressDao;

public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressDao addressDao;
	
	public List<Address> findAll()
	{
		return addressDao.findAll();
	}
	public Address findByAddressId(int id)
	{
		return addressDao.findByAddressId(id);
			
	}
	public Address save(Address address)
	{
		return addressDao.save(address);
	}
	

}
