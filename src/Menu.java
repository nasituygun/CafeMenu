public class Menu {
	private FileIO fileIO;
	private IBST<IItem> BinarySearchTree;

	public Menu() {
		fileIO = new FileIO();
		BinarySearchTree = fileIO.readMenu();
	}

	public void printMinimumPrice (String itemType) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		while (iter.hasNext()) {
			current = iter.next();
			if (current.itemType().equals(itemType)) {
					System.out.println("Minimum priced "+ itemType+" is "+current.itemName()+":\n");
					System.out.println(current + "\n");
					break;
				}
			}
		
		}

	public void printMaximumPrice(String itemType) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		IItem max = null;
		while (iter.hasNext()) {
			current = iter.next();

			if (current.itemType().equals(itemType)) {
				max = current;}
		}
		System.out.println("Maximum priced "+itemType+"is " +max.itemName()+ ":\n");
		System.out.println(max + "\n");
	}

	
	public void printAllItemLessOrEqualThan(int price) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		System.out.println("All item whose prices are less or equal than " + price + ":\n");
		while (iter.hasNext()) {
			current = iter.next();
			if (current.itemPrice() <= price) {
				System.out.println(current);
			}
		}
		System.out.println("");
	}

	public void printAllItemGreaterThan(int price) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		System.out.println("All items whose prices are greater than " + price + ":\n");
		while (iter.hasNext()) {
			current = iter.next();
			if (current.itemPrice() > price) {
				System.out.println(current);
			}
		}
		System.out.println("");
	}

	public void printAllItemInDescendingOrder() {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		IStack<IItem> menuStack = new Stack<IItem>();
		System.out.println("All items in descending order:\n");
		while (iter.hasNext()) {
			current = iter.next();
			menuStack.push(current);
		}
		while (!menuStack.isEmpty()) {
			System.out.println(menuStack.pop());
		}
		System.out.println("");
	}

	public void printAllItemInAscendingOrder() {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		System.out.println("All item in ascending order:\n");
		while (iter.hasNext()) {
			current = iter.next();
			System.out.println(current);
		}
		System.out.println("");
	}

	public void printDescending(String itemType) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		IStack<IItem> stack = new Stack<IItem>();
		System.out.println("All "+itemType+" in descending order:\n");
		while (iter.hasNext()) {
			current = iter.next();
			if (current.itemType().equals(itemType)) {
				stack.push(current);
			}
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("");
	}

	public void printAscending(String itemType) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		System.out.println("All "+itemType+" in ascending order:\n");
		while (iter.hasNext()) {
			current = iter.next();
			if (current.itemType().equals(itemType)) {
				System.out.println(current);
			}
		}
		System.out.println("");
	}
	public void printBakeriesCaloriesLessOrEqualThan(int calories) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		System.out.println( "Bakeries whose calories are less or equal than " + calories + ":\n");
		while (iter.hasNext()) {
			current = iter.next();
			if(current.itemType().equals("Bakery")) {
				if (current.itemSizeorCalories() <= calories) {
					System.out.println(current);
			}
		}}
		System.out.println("");
	}
	public void printBakeriesCaloriesGraterThan(int calories) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		System.out.println( "Bakeries whose calories are grater than " + calories + ":\n");
		while (iter.hasNext()) {
			current = iter.next();
			if(current.itemType().equals("Bakery")) {
				if (current.itemSizeorCalories() > calories) {
					System.out.println(current);
			}
		}}
		System.out.println("");
	}
	public void printAllCoffeeDestencingOrderSize(int size) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		IStack<IItem> stack = new Stack<IItem>();
		System.out.println( "All coffees in descending order in terms of the price, where coffee size is "+ size+":\n" );
		while (iter.hasNext()) {
			current = iter.next();
			if(current.itemType().equals("Coffee")) {
				if (current.itemSizeorCalories() == size) {
					stack.push(current);}}}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
					}
		System.out.println("");
	}
	public void printTeaDestencingOrderSize(int size) {
		Iterator<IItem> iter = BinarySearchTree.getInorderIterator();
		IItem current = null;
		IStack<IItem> stack = new Stack<IItem>();
		System.out.println( "All teas in descending order in terms of the price, where coffee size is "+ size+":\n" );
		while (iter.hasNext()) {
			current = iter.next();
			if(current.itemType().equals("Tea")) {
				if (current.itemSizeorCalories() == size) {
					stack.push(current);}}}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());}
		System.out.println("");}
		
	

	

}