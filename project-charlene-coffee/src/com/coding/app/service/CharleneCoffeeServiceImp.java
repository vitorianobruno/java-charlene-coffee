package com.coding.app.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.coding.app.model.Product;
import com.coding.app.model.Ticket;
import com.coding.app.util.Bonus;
import com.coding.app.util.BonusImpl;

public class CharleneCoffeeServiceImp implements CharleneCoffeeService{

	Bonus bonus = new BonusImpl();
	List<Product> purchase = new ArrayList<>();

	public List<Product> prepare(String order) {
		
		Product[] products = Product.values();
		order = order.toLowerCase();
						
		try {
            for (Product product : products) {
                if (order.contains(product.getDescription().toLowerCase())) {
                    purchase.add(Product.valueOf(product.name()));
                }
            }
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
		return purchase;
	}
		 	
	public Ticket execute(List<Product> purchase) {

		// Order list to apply PROMO in lower prices
		Collections.sort(purchase);
		int stamps = (int)(Math.random()*16);
		double total = 0.00;

		try {
			purchase = bonus.checkExtra(purchase);
			purchase = bonus.checkStamps(purchase, stamps);

			for(Product i : purchase){
				total = total + i.getPrice();
			}
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
		return new Ticket(stamps, UUID.randomUUID().toString(),new Date(), purchase, total);
    }

}
