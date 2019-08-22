package com.skilldistillery.entities;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RentalStoreTests {
	// TODO: make necessary declarations
	private Store s;

	@BeforeEach
	void setUp() throws Exception {
		// TODO: implement
		s = new Store();
	}

	@AfterEach
	void tearDown() throws Exception {
		// TODO: implement
		s = null;
	}

	@Test
	@DisplayName("test you can not register a duplicate customer")
	void testCustomers() {
		// TODO: implement the test
		s.addACustomer(new Customer("Gary", "Smith"));
		s.addACustomer(new Customer("Gary", "Smith"));
		assertEquals(1, s.getCustomers().size());
	}

}
