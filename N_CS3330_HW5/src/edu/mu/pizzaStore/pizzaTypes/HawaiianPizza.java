package edu.mu.pizzaStore.pizzaTypes;

import java.util.ArrayList;
import java.util.List;

import edu.mu.pizzaStore.cooking.ICookingStrategy;
import edu.mu.pizzaStore.pizzaOrdering.Toppings;

public class HawaiianPizza extends AbstractPizza{
	
	//Arraylist that defines the default toppings for a Hawaiian Pizza
	protected final static List<Toppings> defaultToppings = new ArrayList<>(List.of(Toppings.CHEESE, Toppings.CANADIAN_BACON, Toppings.PINEAPPLE));
	
	public HawaiianPizza(double totalPrice,double cookingPrice, int pizzaOrderID, ICookingStrategy cookingStrategy) {
		super(totalPrice,cookingPrice,pizzaOrderID,cookingStrategy);
		//The default toppings are added to the toppingList
		toppingList.addAll(defaultToppings);
		setPriceWithoutToppings(3.00);
	}

	//copy constructor
	public HawaiianPizza(HawaiianPizza original) {
		super(original);
	}

	@Override
	protected double addToppingsToPrice(double riceWithoutToppings) {
		// TODO Auto-generated method stub
		return super.addToppingsToPrice(priceWithoutToppings);
	}

	@Override
	protected double updatePizzaPrice() {
		// TODO Auto-generated method stub
		return super.updatePizzaPrice();
	}
	

}
