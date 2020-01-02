package com.example.quartzdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuartzDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PRepo repo){
		return args -> {
			try {
				MyUser user = new MyUser("rajendra", "paithane");
				repo.save(user);
				System.out.println(repo.findByFirstName("mandar").getId()+" "+repo.findByFirstName("mandar").getLastName());
			}
			catch (Exception e){
				throw new RuntimeException(e);
			}
			};
	}
}
