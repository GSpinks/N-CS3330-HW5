package edu.mu.pizzaStore.pizzaTypes;

import java.util.List;
import edu.mu.pizzaStore.cooking.ICookingStrategy;
import edu.mu.pizzaStore.pizzaOrdering.Toppings;

public abstract class AbstractPizza {
	
	/*Class is unfinished
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
	protected static int orderIDCounter = 0;
	protected ICookingStrategy cookingStrategy;
	
	//Constructor may? have paramaters. No confirmation if it should be a default one.
	public AbstractPizza() {
		/*TODO
		 * 
		 * I don't know how to make the constructors for these classes.
		 * If anyone else could work on this part, I'd appreciate it.
		 * 
		 * The constructor should be implemented to instantiate the toppingList as an ArrayList
		 */
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
		/*This part of the method sets the PriceWithoutToppings attribute upon call
		 * even though a pizza's priceWithoutToppings should be initialized on construction,
		 * so it may seem redundant, but
		 * the Prof wants us to run it like this for testing purposes.
		 * 
		 * 
		 * In Main, just have the argument addToppingsToPrice asks for be the getPriceWithoutToppings() method
		 * for whichever pizza it would be acting on
		 */
		setPriceWithoutToppings(priceWithoutToppings);
		return updatePizzaPrice();
	}
	
	protected double updatePizzaPrice() {
		/*The price without toppings and the price of the toppings ordered are
		 * added to the new totalPrice attribute
		 * to make the total pizza value. */
		for(Toppings topping : getToppingList()) {
			totalPrice += topping.getToppingPrice();
		}
		setTotalPrice(totalPrice + getPriceWithoutToppings());
		return getTotalPrice();
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
	@Override
	public String toString() {
		return  getClass() + " [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", cookingPrice=" + cookingPrice + ", pizzaOrderID=" + pizzaOrderID
				+ ", cookingStrategy=" + cookingStrategy + "]";
	}
	
}
