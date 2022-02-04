public interface IItem extends Comparable<IItem>{
	
	public String itemName(); 
	
	public String itemType();
	
	public int itemPrice();

	public int itemSizeorCalories();
	public String toString();


}
