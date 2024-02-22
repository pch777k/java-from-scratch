package com.pch777;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Homework8ListTest {

     List<Customer> customers = new ArrayList<>();

    @BeforeEach
    void init() {
        Customer al = new Customer("Al", "Pacino", "al@mail.com");
        Customer brad = new Customer("Brad", "Pitt", "brad@mail.com");
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
        //when
        customers.add(new Customer("Robert", "De Niro", "deniro@mail.com"));
        //then
        assertEquals(3, customers.size());
    }

    @Test
    void shouldAddCollectionOfCustomers() {
        //given
        List<Customer> newCustomers = new LinkedList<>(Arrays.asList(
                new Customer("Robert", "De Niro", "deniro@mail.com"),
                new Customer("Emma", "Stone", "emmao@mail.com")));
        //when
        customers.addAll(newCustomers);
        //then
        assertEquals(4, customers.size());
    }

    @Test
    void shouldSetCustomerByIndex() {
        //given
        Customer customer = new Customer("Robert", "De Niro", "deniro@mail.com");
        //when
        customers.set(0, customer);
        //then
        assertEquals(3, customers.get(0).customerId);
        assertEquals("Robert", customers.get(0).firstName);
        assertEquals("De Niro", customers.get(0).lastName);
        assertEquals("deniro@mail.com", customers.get(0).email);
    }

    @Test
    void shouldRemoveCustomerByIndex() {
        //given
        //when
        customers.remove(1);
        //then
        assertEquals(1, customers.size());
    }

    @Test
    void shouldRemoveCustomerByObject() {
        //given
        //when
        Customer customer = customers.get(0);
        customers.remove(customer);
        //then
        assertEquals(1, customers.size());
    }

    @Test
    void shouldRemoveCollectionOfCustomers() {
        //given
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customers.get(0));
        customerList.add(customers.get(1));
        //when
        customers.removeAll(customerList);
        //then
        assertEquals(0, customers.size());
    }



    @Test
    void shouldGetCustomerByIndex() {
        //given
        customers.add(new Customer("Robert", "De Niro", "deniro@mail.com"));
        //when
        Customer customer = customers.get(2);
        //then
        assertEquals(3, customer.customerId);
        assertEquals("Robert", customer.firstName);
        assertEquals("De Niro", customer.lastName);
        assertEquals("deniro@mail.com", customer.email);

    }

    @Test
    void shouldGetFirstCustomerInList() {
        //given
        //when
        Customer customer = customers.getFirst();
        //then
        assertEquals(1, customer.customerId);
        assertEquals("Al", customer.firstName);
        assertEquals("Pacino", customer.lastName);
        assertEquals("al@mail.com", customer.email);

    }

    @Test
    void shouldGetLastCustomerInList() {
        //given
        //when
        Customer customer = customers.getLast();
        //then
        assertEquals(2, customer.customerId);
        assertEquals("Brad", customer.firstName);
        assertEquals("Pitt", customer.lastName);
        assertEquals("brad@mail.com", customer.email);

    }

    @Test
    void shouldContainCustomerInList() {
        //given
        //when
        Customer customer = customers.getLast();
        //then
        assertTrue(customers.contains(customer));

    }

    @Test
    void exceptionShouldBeThrownWhenTheLengthOfArrayIsTooSmall() {
        //given
        //when
        //then
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Customer customer = customers.get(10);
        });

    }


}
