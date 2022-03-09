package eswar.adhithya.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@ComponentScan({"eswar.adhithya.controller", "eswar.adhithya.service","eswar.adhithya.configurations", "eswar.adhithya.exceptions"})
@Configuration
@EnableJpaRepositories("eswar.adhithya.repositery")
@EntityScan("eswar.adhithya.model")
public class SpringBootMainApp {
	
	

	public static void main(String arg[]) 
	{
		System.out.println("this application has started");
		SpringApplication.run(SpringBootMainApp.class, arg);
	}
	
}
