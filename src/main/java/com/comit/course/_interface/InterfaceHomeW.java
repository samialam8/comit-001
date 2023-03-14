package com.comit.course._interface;

interface Animal {
	
	void move();
	void eat();
	
	default void bark() {
		System.out.println("Dog bark at night when sense something");
	}
	
}

class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("Dog is moving around the pool");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog likes to eat bones");
	}
	
}

class Gato implements Animal {

	@Override
	public void move() {
			System.out.println("Gato moves like a wolf");
	}

	@Override
	public void eat() {
			System.out.println("Gato is very fond of eating fish");
	}
	
}

public class InterfaceHomeW {

	public static void main(String[] args) {
			Dog d1 = new Dog();
			Gato g1 = new Gato();
			
			System.out.println("Dog----------Dog");
			d1.move();
			d1.eat();
			d1.bark();
			
			System.out.println("Gato----------Gato");
			g1.move();
			g1.eat();
	}

}
