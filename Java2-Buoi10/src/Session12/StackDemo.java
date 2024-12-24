package Session12;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

        // Thêm phần tử vào stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack after push: " + stack);

        // Lấy phần tử trên cùng
        System.out.println("Top element: " + stack.peek());

        // Xóa phần tử trên cùng
        System.out.println("Popped element: " + stack.pop());

        // Kiểm tra stack sau khi pop
        System.out.println("Stack after pop: " + stack);
	}
}
