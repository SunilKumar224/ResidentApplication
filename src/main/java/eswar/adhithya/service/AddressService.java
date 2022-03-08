package eswar.adhithya.service;

import java.util.List;

import eswar.adhithya.model.Address;

public interface AddressService {
	
	public List<Address> findAll();
	public Address findByAddressId(int id);
	public Address save(Address address);
	

}
