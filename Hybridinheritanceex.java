package com.inheritence;

class Animal {
	public void eat() {
		System.out.println("It is eating");
	}
}

interface Swimmer {
	public void swim();
}

interface Flyer {
	public void fly();
}

class Fish extends Animal implements Swimmer {

	@Override
	public void swim() {
		System.out.println("Fish is Swimming");

	}

}

class Bird extends Animal implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bord os Flying");

	}

}

class FlyingFish extends Animal implements Swimmer, Flyer {

	@Override
	public void fly() {
		System.out.println("Flying Fish is Flying");

	}

	@Override
	public void swim() {
		System.out.println("FlyingFIsh is Swimming");

	}

}

public class Hybridinheritanceex {

	public static void main(String[] args) {
		Fish ob = new Fish();
		ob.swim();
		ob.eat();
		System.out.println();
		Bird ob1 = new Bird();
		ob1.fly();
		ob1.eat();
		System.out.println();
		FlyingFish ob2 = new FlyingFish();
		ob2.eat();
		ob2.fly();
		ob2.swim();
	}

}
