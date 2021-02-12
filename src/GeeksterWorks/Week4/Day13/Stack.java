package GeeksterWorks.Week4.Day13;

import java.util.ArrayList;

import java.util.*;

class Stack<T> {
    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>(); 
    }

    public void push(T val) {
        stack.add(val);
    }

    public T pop() {
        T val = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return val;
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

}