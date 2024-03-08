package edu.mu.pizzaStore.pizzaOrdering;

import edu.mu.pizzaStore.cooking.*;
import edu.mu.pizzaStore.pizzaTypes.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	// Default Constructor
	public PizzaOrder() {
		pizzaFactory = new PizzaCookingFactory();
		pizzaOrderList = new ArrayList<AbstractPizza>();
	}
	
	
	
}
