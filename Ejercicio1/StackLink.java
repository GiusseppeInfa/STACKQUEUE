package Ejercicio1;
import Actividad2.Node;
import Actividad1.ExceptionIsEmpty;
import Actividad1.Stack;

public class StackLink<E> implements Stack<E> {

    private Node<E> top; // Representa el tope de la pila

    public StackLink() {
        top = null;
    }

    @Override
    public void push(E x) {
        Node<E> newNode = new Node<>(x);
        newNode.setNext(top);  // Usar el método setNext() en lugar de acceder directamente a next
        top = newNode;         // Ahora top es el nuevo nodo
    }

    @Override
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");
        }
        E result = top.getData();
        top = top.getNext(); // Elimina el nodo superior
        return result;
    }

    @Override
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");
        }
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    // Para pruebas (opcional)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tope -> ");
        Node<E> current = top;
        while (current != null) {
            sb.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}
