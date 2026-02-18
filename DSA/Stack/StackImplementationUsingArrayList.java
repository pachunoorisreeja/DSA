package DSA.Stack;

import java.util.ArrayList;
import java.util.List;

public class StackImplementationUsingArrayList {
    public static void main(String[] args) {
        StackImplemenation stack = new StackImplemenation();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Peek element "+stack.peek());
        System.out.println("Popped Element "+stack.peek());
        stack.stackElements();
    }

}
class StackImplemenation{
    List<Integer> list = new ArrayList<>();
    public void push(int x){
        list.add(x);
    }
    public void stackElements(){
        System.out.println(list);
    }
    public int pop(){
        if (list.size() ==0){
            System.out.println("Stack is Empty");
            return -1;
        }
        int value = list.get(list.size()-1);
        list.remove(list.size()-1);
        return value;
    }
    public boolean isEmpty(){
        return list.size()==0;
    }
    public int peek(){
        return list.get(list.size()-1);
    }

}