@SuppressWarnings("rawtypes")
public class BinarySearchTree <T extends Comparable<? super T>> implements IBST {
	
	private BinaryNode<T> root;
	
	public void add(Comparable newEntry) {
		root = add(newEntry, root);
	}
	
	private BinaryNode<T> add(Comparable newEntry, BinaryNode<T> node) {

		if (node == null)
			return new BinaryNode<T>((T) newEntry, null, null);		
		if (newEntry.compareTo(node.getData()) < 0) 
			node.setLeft(add(newEntry, node.getLeft()));
		else 
			node.setRight(add(newEntry, node.getRight()));
		return node;
	}

	public void remove(Comparable entry) {
		root = remove(root, entry);
	}

	private BinaryNode<T> remove(BinaryNode<T> rootNode, Comparable entry) {
		if (rootNode == null)
			return rootNode;
		if (entry.compareTo(rootNode.getData()) < 0)
			rootNode.setLeft(remove(rootNode.getLeft(), entry));
		else if (entry.compareTo(rootNode.getData()) > 0)
			rootNode.setRight(remove(rootNode.getRight(), entry));
		else {
			if (rootNode.getLeft() == null)
				return rootNode.getRight();
			else if (rootNode.getRight() == null)
				return rootNode.getLeft();
			rootNode.setData(getMinValue(rootNode.getRight()));
			rootNode.setRight(remove(rootNode.getRight(), entry));
		}
		return rootNode;
	}
	
	private T getMinValue(BinaryNode<T> rootNode) {
		T minValue = rootNode.getData();
		while (rootNode.getLeft() != null) {
			minValue = rootNode.getLeft().getData();
			rootNode = rootNode.getLeft();
		}
		return minValue;
	}

	public boolean contains(Comparable entry) {
		return contains(entry, root);
	}

	private boolean contains(Comparable entry, BinaryNode<T> node) {
		if (entry == null)
			return false;
		if (entry.compareTo(node.getData()) < 0)
			return contains(entry, node.getLeft());
		else if (entry.compareTo(node.getData()) > 0)
			return contains(entry, node.getRight());
		else
			return true; 
	}

	public Comparable getEntry(Comparable entry) {
		return getEntry(entry, root);
	}


	private T getEntry(Comparable entry, BinaryNode<T> node) {
		if (node == null)
			return null;
		if (entry.compareTo(node.getData()) < 0)
			return getEntry(entry, node.getLeft());
		else if (entry.compareTo(node.getData()) > 0)
			return getEntry(entry, node.getRight());
		else
			return node.getData(); 
	}
	
	public boolean isEmpty() {
		return root==null;
	}

	public Iterator<T> getInorderIterator() {
		return new InorderIterator<T>();
	}
	

	private class InorderIterator<T> implements Iterator<T> {

		private IStack<BinaryNode<T>> nodeStack;
		private BinaryNode<T> currentNode;

		public InorderIterator() {
			nodeStack = new Stack<BinaryNode<T>>();
			currentNode = (BinaryNode<T>) root;
		}

		@Override
		public boolean hasNext() {
			return !nodeStack.isEmpty() || (currentNode != null);
		}

		@Override
		public T next() {
			BinaryNode<T> nextNode = null;
			while (currentNode != null) {
				nodeStack.push(currentNode);
				currentNode = currentNode.getLeft();
			}
			if (!nodeStack.isEmpty()) {
				nextNode = nodeStack.pop();
				assert nextNode != null;
				currentNode = nextNode.getRight();
			} else {
				return null;
			}
			return nextNode.getData();
		}

	}



}
