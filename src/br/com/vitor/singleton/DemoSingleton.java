package br.com.vitor.singleton;

public class DemoSingleton {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();

		
		//mesmo objeto
		System.out.println(singleton);
		System.out.println(singleton1);
		
	}
	
	
}
