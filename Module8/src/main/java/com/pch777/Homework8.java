package com.pch777;

import java.util.ArrayList;
import java.util.List;

public class Homework8 {

    public static void main(String[] args) {

        List<Customer> customers = addCustomers();
        List<Customer> customersMale = new ArrayList<>();
        List<Customer> customersFemale = new ArrayList<>();

        System.out.println("CUSTOMERS");
        for (Customer customer : customers) {
            System.out.println(customer);
            if (customer.gender == Gender.MALE) {
                customersMale.add(customer);
            } else {
                customersFemale.add(customer);
            }
        }

        System.out.println("FEMALE CUSTOMERS");
        for(Customer customer : customersFemale) {
            System.out.println(customer);
        }

        System.out.println("MALE CUSTOMERS");
        customersMale.forEach(System.out::println);

    }

    private static List<Customer> addCustomers() {
        List<Customer> customers = new ArrayList<>();

        Customer al = new Customer("Al", "Pacino", "al@mail.com", Gender.MALE);
        Customer brad = new Customer("Brad", "Pitt", "brad@mail.com", Gender.MALE);
        Customer emma = new Customer("Emma", "Stone", "emmao@mail.com", Gender.FEMALE);
        Customer robert = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);

        customers.add(al);
        customers.add(brad);
        customers.add(emma);
        customers.add(robert);
        return customers;
    }
}
