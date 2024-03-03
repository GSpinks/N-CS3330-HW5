package edu.mu.pizzaStore.pizzaOrdering;

//THIS ENUM IS FINISHED

//Student: Aaron Trebus

//This enum declares the types of toppings available
//Each topping has an associated price that is linked to it using the constructor

public enum Toppings {
	TOMATO(1.50),
	CHEESE(2.00),
	PINEAPPLE(2.50),
	BLACK_OLIVE(1.25),
	ITALIAN_SAUSAGE(3.50),
	PEPPERONI(3.00),
	BELL_PEPPER(1.00),
	MUSHROOM(1.50),
	CANADIAN_BACON(4.00);
	
	private double toppingPrice;
	
	private Toppings(double i) {
		this.setToppingPrice(i);
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
}
