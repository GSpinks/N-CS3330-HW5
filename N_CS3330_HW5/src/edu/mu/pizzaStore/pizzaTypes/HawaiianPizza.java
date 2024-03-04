package edu.mu.pizzaStore.pizzaTypes;

import java.util.ArrayList;
import java.util.List;
import edu.mu.pizzaStore.pizzaOrdering.Toppings;

public class HawaiianPizza extends AbstractPizza{
	
	//Arraylist that defines the default toppings for a Hawaiian Pizza
	protected final static List<Toppings> defaultToppings = new ArrayList<>(List.of(Toppings.CHEESE, Toppings.CANADIAN_BACON, Toppings.PINEAPPLE));
	
	/*TODO
	 * 
	 * I don't know how to make the constructors for these classes.
	 * If anyone else could work on this part, I'd appreciate it.
	 * 
	 * Prof said the subclasses should use default constructors.
	 * Above is the list of toppings to add to a hawaiian pizza's toppingList on construction
	 * A hawaiian pizza's default price is 3.00
	 * 
	 * The constructor may have to call on user input in order to be finalized,
	 * in which case we can save it until we're done with the cookingStrategy Interface
	 * and the pizzaOrder methods
	 */
	public HawaiianPizza() {
		
	}

	//copy constructor
	public HawaiianPizza(HawaiianPizza original) {
		super(original);
	}

	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		/*TODO
		 * 
		 * I can't figure out why we'd need to override these methods.
		 * They should work fine as they're written in AbstractPizza for every pizzaType regardless.
		 * 
		 * The method already asks you to give it priceWithoutToppings, so its
		 * usage between classes should be the same. Likely don't need to do anything with this
		 */
		return super.addToppingsToPrice(priceWithoutToppings);
	}

	@Override
	protected double updatePizzaPrice() {
		 /*
		 * Same as above.
		 * However this method is mainly just for using in addToppingToPrice, so we
		 * especially likely don't need to override it.
		 */
		return super.updatePizzaPrice();
	}
	

}
