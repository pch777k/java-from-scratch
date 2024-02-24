package com.pch777;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Homework8ArrayTest {

    private Customer[] customers = new Customer[2];

    @BeforeEach
    void init() {
        Customer al = new Customer("Al", "Pacino", "al@mail.com", Gender.MALE);
        Customer brad = new Customer("Brad", "Pitt", "brad@mail.com", Gender.MALE);
        customers[0] = al;
        customers[1] = brad;
    }

    @AfterEach
    void teardown() {
        Customer.counter=1;
        customers = null;
    }

    @Test
    void shouldAddAllCustomersToArray() {
        //given
        //when
        //then
        assertEquals(2, customers.length);
        assertEquals(1, customers[0].customerId);

    }

    @Test
    void twoCustomersShouldBeTheSame() {
        //given
        //when
        customers[1] = new Customer("Al", "Pacino", "al@mail.com", Gender.MALE);
        customers[1].customerId = 1;
        boolean result = customers[0].equals(customers[1]);

        //then
        assertTrue(result);

    }

    @Test
    void twoCustomersShouldBeNotTheSame() {
        //given
        //when
        boolean result = customers[0].equals(customers[1]);

        //then
        assertFalse(result);

    }

    @Test
    void shouldBePossibleAddCustomerToLongerArray() {
        //given
        Customer[] customersLongerArray = new Customer[3];
        customersLongerArray[0] = customers[0];
        customersLongerArray[1] = customers[1];
        customersLongerArray[2] = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        //when
        //then
        assertEquals(3, customersLongerArray.length);
        assertEquals(3, customersLongerArray[2].customerId);
        assertEquals("deniro@mail.com", customersLongerArray[2].email);

    }

    @Test
    void exceptionShouldBeThrownWhenTheLengthOfArrayIsTooSmall() {
        //given
        Customer robert = new Customer("Robert", "De Niro", "deniro@mail.com", Gender.MALE);
        //when
        //then
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> customers[2] = robert);

    }
}
