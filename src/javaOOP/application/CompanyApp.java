package javaOOP.application;

import javaOOP.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Your Corp");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Denar");
        System.out.println(employee.getName());

        System.out.println(employee.getCompany());
    }
}
