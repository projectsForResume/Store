package com.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.model.CD;
import com.model.Store;

public class StoreTest {
	@Test
	public void testGetProductList() {
		CD cd1 = new CD();
		cd1.setType("Video");
		cd1.setGenre("Film");
		cd1.setName("Matrix");
		cd1.setQuantity();
		Store.addProduct(cd1);
		assertTrue(Store.getProductList().get(0).getName() == cd1.getName());
	}
}
