package Actividad1;

public class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;

    @SuppressWarnings("unchecked")
    public StackArray(int n) {
        this.array = (E[]) new Object[n];
        this.tope = -1;
    }

    public void push(E x) {
        if (isFull()) {
            throw new IllegalStateException("La pila está llena.");
        }
        array[++tope] = x;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("No se puede hacer pop: la pila está vacía.");
        }
        E elem = array[tope];
        array[tope--] = null; // Liberar referencia
        return elem;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("No se puede acceder al tope: la pila está vacía.");
        }
        	
        return array[tope];
    }

    public boolean isEmpty() {
        return this.tope == -1;
    }

    public boolean isFull() {
        return this.tope == array.length - 1;
    }

    public String toString() {
        if (isEmpty()) return "Pila vacía";
        StringBuilder sb = new StringBuilder("Pila: [");
        for (int i = 0; i <= tope; i++) {
            sb.append(array[i]);
            if (i < tope) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

