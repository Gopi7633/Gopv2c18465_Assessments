package com.stackimplementusingarray;

public class StackDemo { 	
	public static void main(String[] args){ 
		IStack<Integer> stackOfInteger = new ArrayStack<>(); 
		stackOfInteger.push(10); 
		stackOfInteger.push(20); 
		stackOfInteger.push(67);
		stackOfInteger.push(15);
		stackOfInteger.push(30);
		System.out.println("Stack of Integers : " + stackOfInteger); 
	} 
}


package com.stackimplementusingarray;

interface IStack<T> { 
	public boolean push(T value); 
	public T pop(); 
	public boolean contains(T value); 
	public int size(); 
	public void clear(); 
	public boolean isEmpty(); 
}



package com.stackimplementusingarray;

import java.util.Arrays;

class ArrayStack<T> implements IStack<T> {
	private static final int DEFAULT_CAPACITY = 10; 
	private T[] store; 
	private int size = 0; 
	private int capacity; 
	
	@SuppressWarnings("unchecked") 
	public ArrayStack() { 
		this.capacity = DEFAULT_CAPACITY; 
		store = (T[]) new Object[DEFAULT_CAPACITY]; 
		} 
	@SuppressWarnings("unchecked") 
	public ArrayStack(int capacity) {
		this.capacity = capacity; 
		store = (T[]) new Object[capacity]; 
		}
	@Override public boolean push(T value)
	{ 
		if (this.size >= store.length) 
		{ 
			int newSize = size + (size >> 1); 
			store = Arrays.copyOf(store, newSize); 
			}
		store[size++] = value;
        return true;

	}
	@Override public T pop() 
	{ 
		if (size <= 0) 
		{ 
			return null; 
			}
		T value = store[--size];
		store[size] = null;
		
		int reducedSize = size; 
		if (size >= capacity && size < (reducedSize + (reducedSize << 1))) {
			System.arraycopy(store, 0, store, 0, size); 
			} 
		return value;
	}
	
	@Override public boolean contains(T value) {
		 boolean found = false; 
		 for (int i = 0; i < size; i++) {
			 T element = store[i]; 
			 if (element.equals(value)) 
			 { 
				 found = true;
				 } 
			 } 
		 return found;
		 } 
	@Override public int size() {
		return size; 
		} 
	@Override public void clear() {
		for (int i = 0; i < size; i++) {
			store[i] = null; } size = 0; 
			} 
	@Override public boolean isEmpty() 
	{ 
		return size == 0; } 
	 @Override public String toString() 
	 { StringBuilder sb = new StringBuilder(); 
	 sb.append("["); for (int i = size - 1; i >= 0; i--) { 
		 sb.append(this.pop()); 
	 if (i > 0)
	 	{ 
		 sb.append(",");
	 	} 
	 } 
	 	sb.append("]");
	 	return sb.toString();
	 }	
}
