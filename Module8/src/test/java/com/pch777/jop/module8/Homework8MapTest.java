package com.pch777.jop.module8;

import com.pch777.jop.module8.model.Customer;
import com.pch777.jop.module8.model.Gender;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Homework8MapTest {

    Map<Integer, Customer> customers = new HashMap<>();

    @BeforeEach
    void init() {
        Customer al = new Customer("Al", "Pacino", "al@mail.com", Gender.MALE);
        Customer brad = new Customer("Brad", "Pitt", "brad@mail.com", Gender.MALE);
        customers.put(al.customerId, al);
        customers.put(brad.customerId, brad);
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
        customers.put(robert.customerId, robert);
        //then
        assertEquals(3, customers.size(), "Size should be 3 after adding a customer");
    }

    @Test
    void shouldRemoveCustomer() {
        //given

        //when
        customers.remove(1);
        //then
        assertEquals(1, customers.size());
    }

    @Test
    void shouldGetCustomerByKey() {
        //given
        //when
        Customer customer = customers.get(2);
        //then
        assertEquals(2, customer.customerId);
        assertEquals("Brad", customer.firstName);
        assertEquals("Pitt", customer.lastName);
        assertEquals("brad@mail.com", customer.email);
    }

    @Test
    void shouldGetCustomerByKeyIfCustomerExistsOrGetDefaultCustomer() {
        //given
        Customer defaultCustomer = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        //when
        Customer customer = customers.getOrDefault(2, defaultCustomer);
        //then
        assertEquals(2, customer.customerId);
        assertEquals("Brad", customer.firstName);
        assertEquals("Pitt", customer.lastName);
        assertEquals("brad@mail.com", customer.email);
    }

    @Test
    void shouldGetCustomerByKeyOrGetDefaultCustomer() {
        //given
        Customer defaultCustomer = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        //when
        Customer customer = customers.getOrDefault(3, defaultCustomer);
        //then
        assertEquals(3, customer.customerId);
        assertEquals("Robert", customer.firstName);
        assertEquals("De Niro", customer.lastName);
        assertEquals("deniro@mail.com", customer.email);
    }

    @Test
    void shouldReturnCorrectKeySetForCustomersMap() {
        //given
        //when
        Set<Integer> keySet = customers.keySet();
        //then
        assertEquals(2, keySet.size());
        assertTrue(keySet.contains(1));
        assertTrue(keySet.contains(2));
        assertFalse(keySet.contains(3));
    }
    


}
