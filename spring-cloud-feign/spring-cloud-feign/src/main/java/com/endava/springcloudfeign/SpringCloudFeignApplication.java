package com.endava.springcloudfeign;

import com.endava.springcloudfeign.model.Person;
import com.endava.springcloudfeign.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(PersonRepository personRepository){
		return args -> {
		personRepository.save(new Person("Tamara","Stankovska","Developer"));
		personRepository.save(new Person("Nikola","Sokolov","Developer"));
		personRepository.save(new Person("Kristijan","Milosev","QA"));

		};
	}
}
