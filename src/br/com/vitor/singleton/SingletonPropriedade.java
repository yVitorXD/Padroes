package br.com.vitor.singleton;

public class SingletonPropriedade {

	//referencio a classe com static 
	private static SingletonPropriedade singleton;
	private String value;
	
	
	//crio uma construtor privado, para ninguem fora a classe consiga instanciar
	private SingletonPropriedade(String value) {
		this.value = value;
	}
	
	//método publico que retorna ele mesmo
	//construtor static
	public static SingletonPropriedade getInstance(String value) {
		if (singleton == null) {
			singleton = new SingletonPropriedade(value);
		}
		return singleton;
	}


	public String getValue() {
		return value;
	}

	
	
	
	
}
	

