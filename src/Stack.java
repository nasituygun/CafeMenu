import java.util.EmptyStackException;

public class Stack<T> implements IStack<T> {

	private T[] stack;
	private int topIndex;
	private static final int DEFAULT_CAPACITY = 50;
	
	public Stack() {
		this(DEFAULT_CAPACITY);
	}

	public Stack(int initialCapacity) {
		T[] tempStack = (T[]) new Object[initialCapacity];
		stack = tempStack;
		topIndex = -1;
	}

	public void push(T newEntry) {
		stack[topIndex + 1] = newEntry;
		topIndex++;
	}

	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
			return top;
		}
	}


	public boolean isEmpty() {
		return topIndex < 0;
	}

}