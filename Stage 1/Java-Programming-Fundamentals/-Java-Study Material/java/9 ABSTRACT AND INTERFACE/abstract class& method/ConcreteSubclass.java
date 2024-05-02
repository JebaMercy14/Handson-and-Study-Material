package com.semanticsquare.oop.abstractdemo;

public class ConcreteSubclass extends AbstractSubclass {
	
	public static void main(String[] args) {
		AbstractSuperclass concrete = new ConcreteSubclass(1, 2);
		//concrete.foo();
		//concrete.bar();
		concrete.compute();
	}

	@Override
	public int bar() {
		System.out.println("bar: " + 20);
		return 20;
	}

}
