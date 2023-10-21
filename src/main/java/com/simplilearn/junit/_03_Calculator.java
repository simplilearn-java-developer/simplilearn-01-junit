package com.simplilearn.junit;

import java.security.InvalidParameterException;

public class _03_Calculator {

	double splitWithFriends(double price, double percentTax, int numFriends) {
		
		if (numFriends == 0) {
			throw new InvalidParameterException("numFriends cannot be Zero");
		}
		
		double amount = price * ( 1 + percentTax/100);
		
		return amount/numFriends;
	}
}
