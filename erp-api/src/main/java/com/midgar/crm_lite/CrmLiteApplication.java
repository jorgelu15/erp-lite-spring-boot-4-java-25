package com.midgar.crm_lite;

import com.midgar.crm_lite.persistence.jpa.entities.OrderEntity;
import com.midgar.crm_lite.persistence.jpa.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrmLiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmLiteApplication.class, args);
	}

}
