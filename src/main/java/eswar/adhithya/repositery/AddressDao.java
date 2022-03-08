package eswar.adhithya.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eswar.adhithya.model.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

	public List<Address> findAll();
	public Address findByAddressId(int id);
	public Address save(Address address);
	
}
