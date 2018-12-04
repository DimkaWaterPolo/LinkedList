package ru.sds.LinkedList;

public class Person {
	
	
	private String name;
	private int age;
	private String className;
	
	public Person() {};
	public Person(String name, int age, String className) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	@Override
	public String toString() {
		
		return ("name - " + name + " , age - " + age + ", class - " + className);
	}
	
}
