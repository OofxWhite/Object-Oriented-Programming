class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

class CustomStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws StackOverflowException {
        if (top >= maxSize - 1) {
            throw new StackOverflowException("Stack is full. Cannot push " + value);
        }
        stackArray[++top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (top < 0) {
            throw new StackUnderflowException("Stack is empty. Cannot pop.");
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class overflow {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
        } catch (StackOverflowException e) {
            System.out.println("Caught StackOverflowException: " + e.getMessage());
        }

        try {
            while (!stack.isEmpty()) {
                int value = stack.pop();
                System.out.println("Popped: " + value);
            }

            stack.pop();
        } catch (StackUnderflowException e) {
            System.out.println("Caught StackUnderflowException: " + e.getMessage());
        }
    }
}
