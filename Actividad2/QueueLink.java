package Actividad2;
import Actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;

    // Constructor: inicializamos primero y último como null
    public QueueLink() {
        this.first = null;
        this.last = null;
    }

    // Método para encolar (agregar un elemento al final de la cola)
    public void enqueue(E x) {
        Node<E> aux = new Node<E>(x); // Creamos un nuevo nodo con el elemento x
        if (this.isEmpty()) { 
            // Si la cola está vacía, el primer y último nodo apuntan al mismo
            this.first = aux; 
        } else {
            // Si la cola no está vacía, enlazamos el nodo nuevo al final
            this.last.setNext(aux);
        }
        // Actualizamos el último nodo de la cola
        this.last = aux;
    }

    // Método para desencolar (eliminar el elemento del frente)
    public E dequeue() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía, no se puede desencolar.");
        }
        // Extraemos el dato del primer nodo
        E value = this.first.getData();
        // Movemos el primer nodo a su siguiente
        this.first = this.first.getNext();
        if (this.first == null) {
            // Si la cola queda vacía después de desencolar, también el último debe ser null
            this.last = null;
        }
        return value;
    }

    // Método para obtener el elemento del final de la cola sin eliminarlo
    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía, no se puede obtener el último elemento.");
        }
        return this.last.getData(); // Retorna el dato del último nodo
    }

    // Método para obtener el primer elemento de la cola sin eliminarlo
    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía, no se puede obtener el primer elemento.");
        }
        return this.first.getData(); // Retorna el dato del primer nodo
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return this.first == null; // Si el primer nodo es null, la cola está vacía
    }

    // Método para representar la cola como una cadena
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = first;
        while (current != null) {
            sb.append(current.getData()).append(" "); // Añadimos el dato de cada nodo
            current = current.getNext(); // Pasamos al siguiente nodo
        }
        return sb.toString(); // Devolvemos la representación como cadena
    }
}
	