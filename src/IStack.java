public interface IStack<T> {
	public void push(T newEntry);

	public T pop();

	public boolean isEmpty();

}