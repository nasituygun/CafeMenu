import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Menu menu = new Menu();
		
		menu.printMinimumPrice("Coffee");
		System.out.println("-----------------------------------------");
		menu.printMaximumPrice("Coffee");
		System.out.println("-----------------------------------------");
		menu.printMinimumPrice("Tea");
		System.out.println("-----------------------------------------");
		menu.printMaximumPrice("Tea");
		System.out.println("-----------------------------------------");
		menu.printMinimumPrice("Coffee");
		System.out.println("-----------------------------------------");
		menu.printMaximumPrice("Coffee");
		System.out.println("-----------------------------------------");
		menu.printMinimumPrice("Bakery");
		System.out.println("-----------------------------------------");
		menu.printMaximumPrice("Bakery");
		System.out.println("-----------------------------------------");
		menu.printAllItemInDescendingOrder();
		System.out.println("-----------------------------------------");
		menu.printAllItemInAscendingOrder();
		System.out.println("-----------------------------------------");
		menu.printDescending("Coffee");
		System.out.println("-----------------------------------------");
		menu.printAscending("Frappuccino");
		System.out.println("-----------------------------------------");
		menu.printDescending("Tea");
		System.out.println("-----------------------------------------");
		
		System.out.print("Please enter a price to see the item with less or equal than. \nprice = ");
		int price = scanner.nextInt();
		menu.printAllItemLessOrEqualThan(price);
		
		System.out.println("-----------------------------------------");
		
		System.out.print("Please enter a price to see the item with greater than. \nprice = ");
		price=scanner.nextInt();
		menu.printAllItemGreaterThan(price);
		
		System.out.println("-----------------------------------------");
		
		System.out.print("Please enter a calories to see the item with less or equal than. \ncalories = ");
		int calories=scanner.nextInt();
		menu.printBakeriesCaloriesLessOrEqualThan(calories);
		
		System.out.println("-----------------------------------------");
		
		System.out.print("Please enter a calories to see the item with grater than. \ncalories = ");
		calories=scanner.nextInt();
		menu.printBakeriesCaloriesGraterThan(calories);
		
		
		System.out.println("-----------------------------------------");
		
		System.out.print("Please enter size to see the coffee descending order in terms of the price,(12-16-20 oz) \nsize = ");
		int size=scanner.nextInt();
		menu.printAllCoffeeDestencingOrderSize(size);
		
		System.out.println("-----------------------------------------");
		
		System.out.print("Please enter size to see the tea descending order in terms of the price,(12-16-20 oz) \n size = ");
		size=scanner.nextInt();
		menu.printTeaDestencingOrderSize(size);
		
		
		
		
		
	}

}
