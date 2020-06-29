package util.core;

import java.util.List;

public class Book {

	static String name = "The complete reference";
	static String author = "Herbert Schildt";
	
	static List<Integer> priceList;
	
	public static String showBook() {
		return name + " by " + author;
	}
	
}
