package tudelft.invoice;

public class Compare {
	public static void main (String [] args) {
		Invoice harry = new Invoice ("harry", 42);
		Invoice marry = new Invoice ("marry", 16);
		Invoice funny = new Invoice ("harry", 2);
		
		if (harry.equals(funny)) {
			System.out.println("harry ist gleich funny");
		} else {
			System.out.println("harry ist nicht gleich funny");
		}
	}

}
