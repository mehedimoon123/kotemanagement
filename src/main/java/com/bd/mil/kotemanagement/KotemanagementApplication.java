package com.bd.mil.kotemanagement;

import com.bd.mil.kotemanagement.domain.Armament;
import com.bd.mil.kotemanagement.repository.ArmamentRepository;
import com.bd.mil.kotemanagement.resource.ArmamentResource;
import com.bd.mil.kotemanagement.service.ArmamentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class KotemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(KotemanagementApplication.class, args);
	}

}
