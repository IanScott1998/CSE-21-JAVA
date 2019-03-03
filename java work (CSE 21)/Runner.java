package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();
		
		testModNCounter();

		testModNCounter2();

		testDecrementableCounter();

		testSeasonCounter();
	}

	
	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		c.increment();
		System.out.println(c.value());

	}

	
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		
		c.reset();
		System.out.println("current value: " + c.value());
		c.increment();
		System.out.println("current value: " + c.value());
		c.increment();
		System.out.println("current value: " + c.value());
		c.increment();

		System.out.println("current value: " + c.value());
	}
	public static void testModNCounter(){
	ModNCounter c = new ModNCounter(2);
	System.out.println(c.value());
	c.increment();
	System.out.println(c.value());
	c.increment();
	System.out.println(c.value());
	c.increment();
	System.out.println(c.value());
	c.increment();
	System.out.println(c.value());
	c.increment();
	System.out.println(c.value());
	c.increment();
	}
	
	public static void testModNCounter2(){
		ModNCounter2 c = new ModNCounter2(3);
		System.out.println(" ");
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
	}
	
	public static void testDecrementableCounter(){
		System.out.println(" ");
		DecrementableCounter c = new DecrementableCounter(4);
		c.decriment();
		System.out.println(c.value());
	}
	
	public static void testSeasonCounter(){
		System.out.println(" ");
		SeasonCounter c = new SeasonCounter();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
	}
}
