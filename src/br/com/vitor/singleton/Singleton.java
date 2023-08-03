package br.com.vitor.singleton;

public class Singleton {

	
	//referencio a classe com static 
	private static Singleton singleton;
	
	//crio uma construtor privado, para ninguem fora a classe consiga instanciar
	private Singleton() {
		
	}
	
	//método publico que retorna ele mesmo
	//construtor static
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
	
	
}
