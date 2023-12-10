package com.microservice.InventoryService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.microservice.InventoryService.model.Inventory;
import com.microservice.InventoryService.repository.InventoryRepository;

@SpringBootApplication
@ComponentScan(basePackages="com.microservice.InventoryService")

@EnableJpaRepositories("com.microservice.InventoryService.repository")

public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner loadData(InventoryRepository invRep) {
//		
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("iphone_15");
//			inventory.setQuantity(100);
//			
//			Inventory inventory1 = new Inventory();
//			inventory1.setSkuCode("iphone_14");
//			inventory1.setQuantity(200);
//			
//			invRep.save(inventory);
//			invRep.save(inventory1);
//		};
//		
//	}

}
