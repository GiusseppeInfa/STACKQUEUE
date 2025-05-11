package Actividad3;
import Actividad2.Node;
import Actividad1.ExceptionIsEmpty;

class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {
    
    // Nodo de la lista enlazada que guarda los datos y la prioridad
    class EntryNode {
        E data;
        N priority;
        
        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }
    }
    
    // Primer y último nodo de la lista
    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }

    // Método para agregar elementos a la cola
    public void enqueue(E x, N pr) {
        EntryNode newEntry = new EntryNode(x, pr);
        Node<EntryNode> newNode = new Node<>(newEntry);
        
        if (first == null || first.getData().priority.compareTo(pr) > 0) {
            // Insertar al principio si la lista está vacía o si el nuevo elemento tiene mayor prioridad
            newNode.setNext(first);
            first = newNode;
            if (last == null) {
                last = first;
            }
        } else {
            // Insertar en la posición correcta para mantener el orden
            Node<EntryNode> current = first;
            while (current.getNext() != null && current.getNext().getData().priority.compareTo(pr) <= 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            if (newNode.getNext() == null) {
                last = newNode; // Si el nuevo nodo es el último
            }
        }
    }

    // Eliminar y devolver el primer elemento (el de mayor prioridad)
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cannot remove from an empty queue");
        }
        E aux = this.first.getData().data;
        this.first = this.first.getNext();
        if (this.first == null) {
            this.last = null; // Si la cola está vacía después de la eliminación
        }
        return aux;
    }

    // Obtener el último elemento de la cola (el de menor prioridad)
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cannot access back from an empty queue");
        }
        return this.last.getData().data;
    }

    // Obtener el primer elemento de la cola (el de mayor prioridad)
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cannot access front from an empty queue");
        }
        return this.first.getData().data;
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return this.first == null;
    }

    // Representar la cola como una cadena
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<EntryNode> current = first;
        while (current != null) {
            result.append(current.getData().data).append(" (Priority: ").append(current.getData().priority).append(") -> ");
            current = current.getNext();
        }
        result.append("null");
        return result.toString();
    }
}
