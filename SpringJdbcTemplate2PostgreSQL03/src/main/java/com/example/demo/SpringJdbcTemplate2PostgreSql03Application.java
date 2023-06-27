package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcTemplate2PostgreSql03Application implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplate2PostgreSql03Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO persons (pessoa, nasc, nivel, saca) VALUES "
				+ "('Pedro Paolo', 1997, 'Advanced', true), "
				+ "('Ppdiniz', 1997 ,'Iniciante', true), "
				+ "('Pepe', 1996, 'Intermediario', true), "
				+ "('Rafaela', 2000, 'Iniciante', false), "
				+ "('Chefe Rodrigo', 1997, 'Avancado', true), "
				+ "('Prof Naka', 1997, 'Avancado', true), "
				+ "('Alice', 1998, 'Iniciante', false)";
	    
	    
			int rows = jdbcTemplate.update(sql); 
			if (rows > 0) {
				System.out.println("A new row has been inserted.");
			}
			
//	public void run(String... args) throws Exception {
//		String sql = "DELETE FROM persons WHERE fullname = 'Rafaela' ";
//				+ "('Penelope', false), "
//			    + "('Adora', true)";
//			}
	}

}
