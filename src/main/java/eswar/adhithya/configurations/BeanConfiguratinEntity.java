package eswar.adhithya.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eswar.adhithya.model.Address;
import eswar.adhithya.model.ResidentMaster;

@Configuration
public class BeanConfiguratinEntity {

	@Bean
	public ResidentMaster getResidentMaster()
	{
		return new ResidentMaster();
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address();
	}
}
