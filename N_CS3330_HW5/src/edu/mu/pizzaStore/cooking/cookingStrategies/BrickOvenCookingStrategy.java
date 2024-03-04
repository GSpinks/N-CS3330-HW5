package edu.mu.pizzaStore.cooking.cookingStrategies;

import edu.mu.pizzaStore.cooking.ICookingStrategy;
import edu.mu.pizzaStore.pizzaTypes.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy{
	
	/*
	 * Student: Aaron Trebus
	 * 
	 * This Class is finished.
	 * 
	 * The implemented method first checks to see if changing the
	 * cookingStyle paramaters would be redundant, and returns false if so.
	 * 
	 * The method also checks to see if a current cooking style is already
	 * in use for that pizza, so the user knows if it's being updated or not.
	 * 
	 * Return true after setting the strategy and cooking price, returns false
	 * if for some reason it can't.
	 */
	
	private final double cookingPrice = 10.0;

	@Override
	public boolean cook(AbstractPizza pizza) {
		if(pizza.getCookingStrategy() == new BrickOvenCookingStrategy()) {
			System.out.println("This cooking style is already selected");
			return false;
			}
		if(pizza.getCookingStrategy() != null) {
			System.out.println("Changing current cooking style from: " + pizza.getCookingStrategy() + " to Brick Oven");
		}
		try {
		pizza.setCookingStrategy(new BrickOvenCookingStrategy ());
		pizza.setCookingPrice(cookingPrice);
		return true;
		}catch(Exception e) {
			System.out.println("Update could not be completed");
			e.printStackTrace();
			return false;
		}
	}

}
