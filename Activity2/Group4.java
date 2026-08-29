package Activity2;

import java.util.Stack;
//Problem: The stack should remove the most recently added item.
/*
 * Group Members:
 * 
 * */
public class Group4 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Book");
        stack.push("Notebook");
        stack.push("Pen");

      
        stack.pop();

        System.out.println(stack);
    }
}