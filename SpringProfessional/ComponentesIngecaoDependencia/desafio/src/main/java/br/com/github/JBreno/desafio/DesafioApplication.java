package br.com.github.JBreno.desafio;

import br.com.github.JBreno.desafio.entities.Order;
import br.com.github.JBreno.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		double basicSalary = sc.nextDouble();
		double discount = sc.nextDouble();
		Order order = new Order(codigo, basicSalary, discount);

		System.out.printf("Pedido código %d%n", order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

    }
}
