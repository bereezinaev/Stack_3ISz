public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Добавление элементов в стек
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Вывод текущего размера стека
        System.out.println("Size: " + stack.size()); // Output: Size: 3

        // Получение элемента с вершины стека
        System.out.println("Peek: " + stack.peek()); // Output: Peek: 30

        // Удаление элемента из стека
        System.out.println("Pop: " + stack.pop()); // Output: Pop: 30

        // Проверка, пуст ли стек
        System.out.println("Is empty: " + stack.isEmpty()); // Output: Is empty: false

        // Очистка стека
        stack.clear();

        // Проверка, пуст ли стек после очистки
        System.out.println("Is empty after clear: " + stack.isEmpty()); // Output: Is empty after clear: true
    }
}