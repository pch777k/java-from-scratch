package com.pch777.jop.module8;

import com.pch777.jop.module8.model.Customer;
import com.pch777.jop.module8.model.Gender;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Homework8ListTest {

    List<Customer> customers = new ArrayList<>();

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
        assertEquals(3, customers.size(), "Size should be 3 after adding a customer");
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
    void shouldSetCustomerByIndex() {
        //given
        Customer customer = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        //when
        customers.set(0, customer);
        //then
        assertEquals(3, customers.getFirst().customerId);
        assertEquals("Robert", customers.getFirst().firstName);
        assertEquals("De Niro", customers.getFirst().lastName);
        assertEquals("deniro@mail.com", customers.getFirst().email);
        assertEquals(Gender.MALE, customers.getFirst().gender);
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
        Customer customer = customers.getFirst();
        //when
        customers.remove(customer);
        //then
        assertEquals(1, customers.size());
        assertFalse(customers.contains(customer));
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
        customers.add(new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE));
        //when
        Customer customer = customers.get(2);
        //then
        assertEquals(3, customer.customerId);
        assertEquals("Robert", customer.firstName);
        assertEquals("De Niro", customer.lastName);
        assertEquals("deniro@mail.com", customer.email);
        assertEquals(Gender.MALE, customers.getFirst().gender);

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
        assertEquals(Gender.MALE, customer.gender);

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
        assertEquals(Gender.MALE, customer.gender);

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

        assertThrows(IndexOutOfBoundsException.class, () -> {
            Customer customer = customers.get(10);
        });

    }

    @Test
    void shouldIterateInReverseDirectionByListIterator() {
        //given
        Customer emma = new Customer("Emma", "Stone", "emmao@mail.com", Gender.FEMALE);
        Customer robert = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        customers.add(emma);
        customers.add(robert);
        String result = "";

        //when
        ListIterator<Customer> customerIterator = customers.listIterator(customers.size());
        while(customerIterator.hasPrevious()) {
            result += customerIterator.previous().customerId;
        }

        //then
        assertEquals("4321", result);
    }

    @Test
    void shouldIterateInReverseDirectionByReversedMethod() {
        //given
        Customer emma = new Customer("Emma", "Stone", "emmao@mail.com", Gender.FEMALE);
        Customer robert = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        customers.add(emma);
        customers.add(robert);
        String result = "";

        //when

        for(Customer customer : customers.reversed()) {
            result += customer.customerId;
        }

        //then
        assertEquals("4321", result);
    }


}
