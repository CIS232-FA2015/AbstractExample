package cis232.example;

public class AbstractExample {

	public static void main(String[] args) {
		Employee e = new LowlyEmployee("Jake", new Boss("Bill"));
		
		System.out.println(e);
		System.out.println("Boss: " + e.getBoss());
	}

}
