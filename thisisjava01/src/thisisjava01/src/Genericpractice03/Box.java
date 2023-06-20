package Genericpractice03;

public class Box<T> {

	T data;
	
	public Box() {
}

public Box(T data) {
	this.data =data;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data =data;
 }
}