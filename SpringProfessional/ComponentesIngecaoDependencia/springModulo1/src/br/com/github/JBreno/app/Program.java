package br.com.github.JBreno.app;

import br.com.github.JBreno.entities.Employee;
import br.com.github.JBreno.service.BrazilTaxService;
import br.com.github.JBreno.service.PensionService;
import br.com.github.JBreno.service.SalaryService;
import br.com.github.JBreno.service.TaxService;

import javax.management.PersistentMBean;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Salário bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);
        TaxService taxService = new BrazilTaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salario liquido = %.2f%n", netSalary);

        sc.close();

    }
}
