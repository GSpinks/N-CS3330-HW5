package edu.mu.pizzaStore.pizzaTypes;

import java.util.ArrayList;
import java.util.List;

import edu.mu.pizzaStore.pizzaOrdering.Toppings;

public class VegetarianPizza extends AbstractPizza{
	
	//Arraylist that defines the default toppings for a Supreme Pizza
	protected final static List<Toppings> defaultToppings = new ArrayList<>(List.of(Toppings.TOMATO, Toppings.CHEESE,
			Toppings.BELL_PEPPER, Toppings.BLACK_OLIVE, Toppings.MUSHROOM));
	
	/*TODO
	 * 
	 * I don't know how to make the constructors for these classes.
	 * If anyone else could work on this part, I'd appreciate it.
	 * 
	 * Prof said the subclasses should use default constructors.
	 * Above is the list of toppings to add to a veggie pizza's toppingList on construction
	 * A hawaiian pizza's default price is 1.50
	 * 
	 * The constructor may have to call on user input in order to be finalized,
	 * in which case we can save it until we're done with the cookingStrategy Interface
	 * and the pizzaOrder methods
	 */

	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		// TODO
		//see hawaiianpizza for notes
		return super.addToppingsToPrice(priceWithoutToppings);
	}

	@Override
	protected double updatePizzaPrice() {
		// TODO 
		//See hawaiianpizza for notes
		return super.updatePizzaPrice();
	}
	
	

}
