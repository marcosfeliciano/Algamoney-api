package com.algaworks.algamoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.SQLException;


@SpringBootApplication
public class AlgamoneyApiApplication {

	public static void main(String[] args) throws SQLException{
		SpringApplication.run(AlgamoneyApiApplication.class, args);
	}

}
