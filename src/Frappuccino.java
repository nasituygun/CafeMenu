
public class Frappuccino implements IItem {

	private String itemName;
	private String itemType;
	private int itemPrice;
	private int itemSize;
	
	public Frappuccino(String itemName, int itemPrice, int itemSize) {
		this.itemName = itemName;
		this.itemType = "Frappuccino";
		this.itemPrice = itemPrice;
		this.itemSize = itemSize;
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
		return itemSize;
	}
	public int compareTo(IItem other) {
		return itemPrice - other.itemPrice();
	}
	public String toString() {
		return itemType + "|" + itemName + "|" + itemPrice + "|" + itemSize+"oz" ;
	}

	
	
}
