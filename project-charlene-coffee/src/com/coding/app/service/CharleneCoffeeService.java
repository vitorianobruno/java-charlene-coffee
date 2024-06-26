package com.coding.app.service;

import java.util.List;

import com.coding.app.model.Product;
import com.coding.app.model.Ticket;

public interface CharleneCoffeeService {

	public List<Product> prepare(String order);
	public Ticket execute(List<Product> items);
}
