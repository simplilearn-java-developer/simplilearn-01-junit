package com.simplilearn.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class _03_CalculatorTest {

    _03_Calculator calculator;

    @BeforeAll
    void initialize() {

        calculator = new _03_Calculator();
    }

    @Order(1)
    @ParameterizedTest(name="{index} - ${0} price, {1}% tax, {2} friends, ${3} amount")
    @CsvSource({
        "100, 13, 2, 56.4999",
        "500, 5, 3, 175",
        "300, 13, 4, 84.7499"
    })
    void testSplitWithFriends(double price, double percentTax, int numFriends, double amount) {

        assertEquals(amount, calculator.splitWithFriends(price,percentTax,numFriends), 0.0001);
    }

    @Order(2)
    @Test
    void testSplitWithFriendsException() {

        assertThrows(InvalidParameterException.class, () -> calculator.splitWithFriends(100,13,0));
    }

}
