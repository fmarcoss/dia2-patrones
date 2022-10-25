package com.nttdata.bootcamp.patrones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronesApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("test");
	}

}
