package com.jrodrigues.viacep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.jrodrigues.viacep.client.CepClient;
import com.jrodrigues.viacep.dto.Endereco;

@SpringBootApplication
@EnableFeignClients
public class ZupViacepApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ZupViacepApplication.class, args);
	}

}
