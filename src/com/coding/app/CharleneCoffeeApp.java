package com.coding.app;

import java.util.List;

import com.coding.app.model.Product;
import com.coding.app.model.Ticket;
import com.coding.app.service.CharleneCoffeeService;
import com.coding.app.service.CharleneCoffeeServiceImp;

public class CharleneCoffeeApp {
	
	public static void main(String[] args) {
        
		CharleneCoffeeService service = new CharleneCoffeeServiceImp();
		String order = "large coffee with extra milk, small coffee with special roast, bacon roll, orange juice";

		List<Product> products = service.prepare(order);
		Ticket ticket = service.execute(products);

		System.out.println(ticket.toString());
		
    }
	
}
