public class Stack<T> {
    private Node<T> top; // Указатель на вершину стека
    private int size;    // Текущий размер стека

    // Внутренний класс для представления узла стека
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Конструктор
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Добавление элемента в стек (push)
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Удаление элемента из стека (pop)
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Получение элемента с вершины стека (peek)
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return top == null;
    }

    // Получение текущего размера стека
    public int size() {
        return size;
    }

    // Очистка стека
    public void clear() {
        top = null;
        size = 0;
    }
}