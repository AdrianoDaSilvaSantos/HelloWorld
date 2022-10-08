package br.com.hello;

import br.com.company.Employee;

import java.time.LocalDate;

public class Main {
    public static  void main(String[] args) {
        System.out.println("Hello world!");
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        Employee eOK = new Employee(null);
        System.out.println(eOK);
        Employee e = new Employee(null);
        System.out.println(e);
        Employee e1 = new Employee(null);
        System.out.println(e1);
        Employee e2 = new Employee(null);
        System.out.println(e2);
    }
}