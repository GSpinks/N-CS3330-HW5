package edu.mu.pizzaStore.pizzaTypes;

import java.util.ArrayList;
import java.util.List;

import edu.mu.pizzaStore.cooking.ICookingStrategy;
import edu.mu.pizzaStore.pizzaOrdering.Toppings;

public abstract class AbstractPizza {
	
	/*Unless price issues are encountered during testing, this class is finished
	 * 
	 * Student: Aaron Trebus
	 * 
	 * This class makes the abstract layout for all defined pizza classes.
	 * 
	 * It defines the constructor, the getters and setters,
	 * as well as the methods to change each pizza's price during the ordering stage.
	 */

	protected List<Toppings> toppingList;
	protected double priceWithoutToppings, totalPrice, cookingPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected ICookingStrategy cookingStrategy;
	
	public AbstractPizza(double totalPrice,double cookingPrice, int pizzaOrderID, ICookingStrategy cookingStrategy) {
		this.toppingList = new ArrayList<Toppings>();
	}
	
	//copy constructor
	public AbstractPizza(AbstractPizza original) {
		this.toppingList = original.toppingList;
		this.priceWithoutToppings = original.priceWithoutToppings;
		this.totalPrice = original.totalPrice;
		this.cookingPrice = original.cookingPrice;
		this.pizzaOrderID = original.pizzaOrderID;
		this.cookingStrategy = original.cookingStrategy;
	}
	
	protected double addToppingsToPrice(double priceWithoutToppings) {
		//This part of the method sets the PriceWithoutToppings attribute upon call
		setPriceWithoutToppings(priceWithoutToppings);
		//Calls on method right below
		return updatePizzaPrice();
	}
	
	protected double updatePizzaPrice() {
		/*The price without toppings and the price of the toppings ordered are added to the new totalPrice attribute
		to make the total pizza value. Even though the same result could have been done without making totalPrice,
		I figured this was the easiest way for my teammates to see what's happening here.*/
		double totalPrice = getPriceWithoutToppings();
		for(Toppings topping : getToppingList()) {
			totalPrice += topping.getToppingPrice();
		}
		setTotalPrice(totalPrice);
		return totalPrice;
	}
	
	public List<Toppings> getToppingList() {
		return toppingList;
	}
	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}
	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getCookingPrice() {
		return cookingPrice;
	}
	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	public int getPizzaOrderID() {
		return pizzaOrderID;
	}
	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}
	public static int getOrderIDCounter() {
		return orderIDCounter;
	}
	public static void setOrderIDCounter(int orderIDCounter) {
		AbstractPizza.orderIDCounter = orderIDCounter;
	}
	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}
	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}
	
	
}
