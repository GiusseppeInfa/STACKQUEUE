package Actividad2;

public class Node<T> {
    T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}

