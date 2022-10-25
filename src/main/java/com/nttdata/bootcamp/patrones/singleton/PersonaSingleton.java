/**
 * 
 */
package com.nttdata.bootcamp.patrones.singleton;

/**
 * @author fmarcoss
 *
 */
public final class PersonaSingleton {

	private String name;
	private Integer age;
	private static PersonaSingleton personaInstance;

	private PersonaSingleton() {

	}

	public static PersonaSingleton getInstance() {
		
		return personaInstance == null ? personaInstance = new PersonaSingleton() : personaInstance;
		
	}
	
	public void singletonOperation() {
		System.out.println("Soy una persona!!");
		System.out.println("Mi nombre es "+ name+" y tengo "+age+" años.");
	}
}
