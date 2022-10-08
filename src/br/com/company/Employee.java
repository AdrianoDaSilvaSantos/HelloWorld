package br.com.company;

public class Employee {

    private String name;

    public Employee(String name){
        if (name == null){
            throw new RuntimeException("É necessário informar o nome do funcionário");
        }
        this.name = name;
    }
}
