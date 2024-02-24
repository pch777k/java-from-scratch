package com.pch777;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework8SetTest {

    Set<Customer> customers = new HashSet<>();

    @BeforeEach
    void init() {
        Customer al = new Customer("Al", "Pacino", "al@mail.com", Gender.MALE);
        Customer brad = new Customer("Brad", "Pitt", "brad@mail.com", Gender.MALE);
        customers.add(al);
        customers.add(brad);
    }

    @AfterEach
    void teardown() {
        Customer.counter=1;
        customers.clear();
    }

    @Test
    void shouldAddCustomer() {
        //given
        Customer robert = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        //when
        customers.add(robert);
        //then
        assertEquals(3, customers.size());
    }

    @Test
    void shouldAddCollectionOfCustomers() {
        //given
        List<Customer> newCustomers = new LinkedList<>(Arrays.asList(
                new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE),
                new Customer("Emma", "Stone", "emmao@mail.com", Gender.FEMALE)));
        //when
        customers.addAll(newCustomers);
        //then
        assertEquals(4, customers.size());
    }

    @Test
    void shouldRemoveCustomerByFirstName() {
        //given
        customers.removeIf(c -> c.firstName.equals("Al"));

        //then
        assertEquals(1, customers.size());
    }

}
