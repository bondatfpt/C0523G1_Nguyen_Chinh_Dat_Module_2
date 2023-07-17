package ss11_dsa_stack_queue.practice.exe1;

import java.util.LinkedList;
import java.util.Stack;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack() {
        stack = new LinkedList();
    }
    // Phương thức kiểm tra stack trống hay không;
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    // Phương thức đẩy 1 đối tượng vào stack;
    public void push(T element) {
        stack.addFirst(element);
    }
    // Phương thức lấy ra một đối tượng trong stack;
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack rỗng");
        }
        return stack.removeFirst();
    }
    // Phương thức trả về size của stack;
    public int size(){
       return this.stack.size();
    }
}
