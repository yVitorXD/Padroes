package br.com.vitor.builder;

public class Client {

	public static void main(String[] args) {
		
		FastFoodMeal burgerCombo = new FastFoodMealBuilder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Coke's")
				.thatsAll();
		System.out.println(burgerCombo);
		
		FastFoodMeal justFries = new FastFoodMealBuilder("Fries")
				.thatsAll();
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Cake")
				.andGift("2 kilograms")
				.thatsAll();
		System.out.println(heartAtackCombo);
		
	}

	
	
	
}
