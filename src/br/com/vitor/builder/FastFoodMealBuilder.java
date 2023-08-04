package br.com.vitor.builder;

public class FastFoodMealBuilder {

	//Obrigatorio
	private String side;
	
	//Opcional
	
	private String drink;
	private String main;
	private String dessert;
	private String gift;
	
	
	// so tem o "side" pq é o unico obrigatorio, poderia ter mais
	public FastFoodMealBuilder(String side) {
		this.side = side;
	}

	public FastFoodMealBuilder forDrink(String drink) {
		this.drink = drink;
		//esse "this" retorna para o "FastFoodMealBuilder"
		return this;
	}
	
	public FastFoodMealBuilder andMain(String main) {
		this.main = main;
		return this;
	}
	
	public FastFoodMealBuilder andDessert(String desser) {
		this.dessert = desser;
		return this;
	}
	
	public FastFoodMealBuilder andGift(String gift) {
		this.gift = gift;
		return this;
	}
	
	//aqui ele retorna tudo pra classe FastFoodMeal, tanto se foi colocado todos, tem 4 opcionais que entram mesmo assim
	public FastFoodMeal thatsAll() {
		return new FastFoodMeal(drink, main, side, dessert, gift);
	}
	
	
	
	
	
	
	
	
	
	
	
}
