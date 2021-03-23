import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();

        // Add elements to Stack Push
        stack1.push("one");
        stack1.push("two");
        stack1.push("Three");
        stack1.push("Four");
        stack1.push("Five");
        System.out.println("Stack: " + stack1);

        // Access element from the top Peek
        String element = stack1.peek();
        System.out.println("Element at top: " + element);

        // Removing elements using pop() method
        System.out.println("Popped element: "
                + stack1.pop());
        System.out.println("Popped element: "
                + stack1.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                + stack1);

        // Check if stack is empty
        boolean result = stack1.empty();
        System.out.println("Is the stack empty? " + result);


        // Search an element
        int position = stack1.search("two");
        System.out.println("Position of two: " + position);

    }
}
