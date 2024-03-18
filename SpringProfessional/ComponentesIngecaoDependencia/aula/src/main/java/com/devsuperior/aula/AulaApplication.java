package com.devsuperior.aula;

import com.devsuperior.entities.Employee;
import com.devsuperior.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"}) // essa notação vai servir
// porque eu coloquei entities, e services no mesmo nivel de aula, só que eu deveria ter colocado dentro de daula
// no caso o Spring está só procurando projetos dentro do aula, mas ai eu fui e falei que eu deveria procurar no com.dev...
public class AulaApplication implements CommandLineRunner {
	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee("Maria", 4000.00);
		System.out.println(salaryService.netSalary(employee));
	}
}
