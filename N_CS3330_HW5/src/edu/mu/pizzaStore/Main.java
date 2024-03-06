package edu.mu.pizzaStore;

import java.util.Scanner;

import edu.mu.pizzaStore.cooking.cookingStrategies.BrickOvenCookingStrategy;
import edu.mu.pizzaStore.cooking.cookingStrategies.ConventionalOvenCookingStrategy;
import edu.mu.pizzaStore.cooking.cookingStrategies.MicrowaveCookingStrategy;
import edu.mu.pizzaStore.pizzaTypes.AbstractPizza;
import edu.mu.pizzaStore.pizzaTypes.HawaiianPizza;

public class Main {
	
	public static void main(String[] args) {

		/*
		 * Basic testing protocol was made by:
		 * Student: Aaron Trebus
		 * 
		 */
		
		Scanner userInput = new Scanner(System.in);
		int choice = 0;
		
		while(choice==0) {
		System.out.println("Welcome to our Pizza Place Tester!");
		System.out.println("Options:\n1. Make a new pizza\n2.Quit");
		
		choice = userInput.nextInt();
		switch(choice) {
		case 1:
			makePizza();
			choice = 0;
		case 2:
			userInput.close();
			System.exit(0);
		default:
			System.out.println("Choice invalid");
			userInput.close();
			System.exit(0);
			}
		}
	}
	
	public static void makePizza() {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What kind of Pizza would you like?\n1. Hawaiian\n2.Margherita\n3.Supreme\n4.Vegetarian");
		int pizzaChoice = userInput.nextInt();
		System.out.println("How would you like it cooked?\n1.Brick oven\n2.Conventional oven\n3.Microwave");
		int cookingChoice = userInput.nextInt();
		switch(pizzaChoice) {
		case 1:
			HawaiianPizza hawaiianPizza = new HawaiianPizza();
			cookPizza(cookingChoice, hawaiianPizza);
			hawaiianPizza.toString();
			hawaiianPizza.callAddToppingsToPrice(hawaiianPizza.getPriceWithoutToppings());
			System.out.println(hawaiianPizza.toString());
			userInput.close();
			System.exit(0);
		}
	}
	
	public static void cookPizza(int userInput, AbstractPizza pizza) {
		BrickOvenCookingStrategy brickOven = new BrickOvenCookingStrategy();
		ConventionalOvenCookingStrategy conOven = new ConventionalOvenCookingStrategy();
		MicrowaveCookingStrategy microOven = new MicrowaveCookingStrategy();
		
		switch(userInput) {
		case 1:
			brickOven.cook(pizza);
			break;
		case 2:
			conOven.cook(pizza);
			break;
		case 3:
			microOven.cook(pizza);
			break;
		default:
			System.out.println("Invalid input");
			System.exit(0);
		}
	}

}
