package edu.mu.pizzaStore.cooking;
import edu.mu.pizzaStore.pizzaTypes.AbstractPizza;

/*
 * Student: Aaron Trebus
 * 
 * This Interface is finished.
 * 
 * The implemented method will be overwritten by the three
 * cooking style classes
 */

public interface ICookingStrategy {
	
	public boolean cook(AbstractPizza pizza);

}
