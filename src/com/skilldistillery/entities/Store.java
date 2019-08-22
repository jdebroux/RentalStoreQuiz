package com.skilldistillery.entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Store {
	// TODO: each store has an id
	private int id;
	private static int totalStores;
	// TODO: each store has 0 or more unique Customers
	private Set<Customer> customers;

	// TODO: implement the required methods to:
	// * Add a customer (no duplicates allowed)
	// * Return the number of customers
	// * Display all data
	public Store() {
		this.id = totalStores + 1;
		customers = new HashSet<>();
	}

	public int getId() {
		return id;
	}

	public Set<Customer> getCustomers() {
		Set<Customer> newCustomers = new HashSet<>(customers);
		return newCustomers;
	}

	public void addACustomer(Customer newCustomer) {
		for (Customer customer : customers) {
			if (customer.getLastName().equals(newCustomer.getLastName())) {
				return;
			} else if (customer.getFirstName().equals(newCustomer.getFirstName())) {
				return;
			}
		}
		customers.add(newCustomer);
	}

	public int totalCustomers() {
		return customers.size();
	}

	public void displayAllData() {
		System.out.println("Store: " + id);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
