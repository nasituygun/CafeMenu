public interface IBST <T extends Comparable<? super T>> {
	public boolean contains(T entry);
	public T getEntry(T entry);
	public void add(T newEntry);
	public void remove(T entry);
	Iterator<T> getInorderIterator();
	
	
	
	
	

}
