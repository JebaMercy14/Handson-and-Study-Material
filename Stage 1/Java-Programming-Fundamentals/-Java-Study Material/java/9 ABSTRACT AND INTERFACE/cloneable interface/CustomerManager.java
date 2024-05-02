package com.semanticsquare.oop;

public class CustomerManager {
	
	public Customer getCustomer(String acctId) {		
		Customer customer = fetchCustomer(acctId);	
		Customer clone = customer.clone();
		
		if (clone != null && clone != customer) {
			System.out.println("Clone successful");
		}
		return customer;
	}

	private Customer fetchCustomer(String acctId) {
		Customer customer = new Customer(acctId, "Dheeru", 400);
		return customer;
	}
}
