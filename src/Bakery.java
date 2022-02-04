public class Bakery implements IItem  {

	private String itemName;
	private String itemType;
	private int itemPrice;
	private int itemCalories;
	
	public Bakery(String itemName, int itemPrice, int itemCalories) {
		this.itemName = itemName;
		this.itemType = "Bakery";
		this.itemPrice = itemPrice;
		this.itemCalories = itemCalories;
	}
	@Override
	public String itemName() {

		return itemName;
	}
	@Override
	public String itemType() {

		return itemType;
	}
	@Override
	public int itemPrice() {

		return itemPrice;
	}
	public int itemSizeorCalories() {
		return itemCalories;
	}
	
	
	public int compareTo(IItem other) {
		return itemPrice - other.itemPrice();
	}
	public String toString() {
		return itemType + " | " + itemName + " | " + itemPrice + " | " + itemCalories;
	}
	
	
}