# Coding Assignment: Charlene's Coffee Corner

![](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)
![](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)

Recently, Charlene decided to open her very own little coffee shop on a busy street corner.
Being the careful entrepreneur, she decided to start off with a limited offering, with the option to expand her
choice of products, as business goes.

### Her Offering
 - Coffee (small, medium, large) 2.50 CHF, 3.00 CHF, 3.50 CHF
 - Bacon Roll 4.50 CHF
 - Freshly squeezed orange juice (0.25l) 3.95 CHF

### Extras:
- Extra milk 0.30 CHF
- Foamed milk 0.50 CHF
- Special roast coffee 0.90 CHF

### Bonus Program
- Charlene's idea is to attract as many regular‘s as possible to have a steady turnaround.
- She decides to offer a customer stamp card, where every 5th beverage is for free.
- If a customer orders a beverage and a snack, one of the extra's is free.

## Task

A simple Java SE program whose output is formatted like a receipt you would receive at a supermarket.
The input to the program is a list of products the shopper wants to purchase (large coffee with extra milk, small
coffee with special roast, bacon roll, orange juice)

### Main class structure

```bash
public class CharleneCoffeeApp {
	
	public static void main(String[] args) {
        
		CharleneCoffeeService service = new CharleneCoffeeServiceImp();;
		
		String order = "large coffee with extra milk, small coffee with special roast, bacon roll, orange juice";
		
		List<Products> products = service.prepare(order);
		
```

### Expected result

```bash
AVAILABLE STAMPS: 14
   TICKET ## Charlene's Coffee Corner ##
Id Receipt: 4cabf09f-fa47-4bb8-b45b-fc1b91fb2918
Date      : Thu Dec 17 19:47:49 CET 2020
Item      : Small Coffee, 0.0, CHF * PROMO *
Item      : Large Coffee, 0.0, CHF * PROMO *
Item      : Bacon Roll, 4.5, CHF 
Item      : Orange Juice, 3.95, CHF 
Item      : Extra milk, 0.0, CHF * PROMO *
Item      : Special roast, 0.9, CHF 
Total     : 9.35 CHF
```

