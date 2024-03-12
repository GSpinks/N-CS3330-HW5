package edu.mu.pizzaStore.pizzaOrdering;

import edu.mu.pizzaStore.pizzaTypes.AbstractPizza;
import edu.mu.pizzaStore.pizzaTypes.HawaiianPizza;
import edu.mu.pizzaStore.pizzaTypes.MargheritaPizza;
import edu.mu.pizzaStore.pizzaTypes.SupremePizza;
import edu.mu.pizzaStore.pizzaTypes.VegetarianPizza;

public class PizzaCookingFactory {
  static int PizzaOrderID = 0;
	
	public AbstractPizza createPizza(PizzaType pizzaType){
		AbstractPizza kindOfPizza = null;
		
		if(pizzaType.equals((PizzaType.HAWAIIAN))){
			kindOfPizza = new HawaiianPizza();
		}
		else if(pizzaType.equals((PizzaType.MARGHERITA))){
			kindOfPizza = new MargheritaPizza();
		}
		else if(pizzaType.equals((PizzaType.VEGETARIAN))){
			kindOfPizza = new VegetarianPizza();
		}
		else if(pizzaType.equals((PizzaType.SUPREME))){
			kindOfPizza = new SupremePizza();
		}
		
		PizzaOrderID++;
		kindOfPizza.setPizzaOrderID(PizzaOrderID);
		return kindOfPizza;
	}
}
