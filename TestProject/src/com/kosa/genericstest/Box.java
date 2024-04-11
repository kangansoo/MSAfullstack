package com.kosa.genericstest;

public class Box<T extends Person> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
