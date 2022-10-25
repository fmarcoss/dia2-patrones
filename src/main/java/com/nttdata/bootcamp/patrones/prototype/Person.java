/**
 * 
 */
package com.nttdata.bootcamp.patrones.prototype;

/**
 * @author fmarcoss
 *
 */
public class Person implements iClone {
	
	private String name;
	private Integer age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public Person(Person person) {
		this.name=person.getName();
		this.age=person.getAge();
		
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public Person clone() {
		return new Person(this);
	}
	
	

}
