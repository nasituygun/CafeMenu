import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
	public IBST<IItem> readMenu() {
		IBST<IItem> binarySearchTree = new BinarySearchTree<IItem>();
		
		try {
			File file = new File("CENG112_HW4_CafeMenu.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				if(data.length() == 0) {
					  continue;
				  }
				String[] parsedData = data.split(",");
				String type = parsedData[0];
				String name = parsedData[1];
				int price = Integer.parseInt(parsedData[2]);
				if (type.equals("Bakery")){
					int calories=Integer.parseInt(parsedData[3]);
					binarySearchTree.add(new Bakery(name, price, calories));
					}
				else {
					String[] sizeOz =parsedData[3].split("oz");
					int size=Integer.parseInt(sizeOz[0]);
					if (type.equals("Coffee")) {
						binarySearchTree.add(new Coffee(name, price, size));}
					else if (type.equals("Tea")) {
						binarySearchTree.add(new Tea(name, price, size));}
					else if (type.equals("Frappuccino")) {
							binarySearchTree.add(new Frappuccino(name, price, size));}
					
						
					}
				}}

			
		 catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return binarySearchTree;
	}}
