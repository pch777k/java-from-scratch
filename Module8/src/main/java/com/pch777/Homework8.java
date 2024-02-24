package com.pch777;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Homework8 {

    public static void main(String[] args) {

        List<Customer> customers = addCustomers();

        for (Customer customer : customers) {
            System.out.println(customer);
        }


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
