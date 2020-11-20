package algorithms.StackAndQuene;

import java.util.Stack;

public class StackSortStack {

    /**
     * @param stack 用一个栈实现另一个栈的排序
     */
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(1);
        stack.push(6);
        stack.push(2);
        stack.push(5);
        stack.push(4);
        sortStackByStack(stack);
        int stack_size= stack.size();
        System.out.println("stack元素是：");
        for (int size=0; size < stack_size; size ++){
            System.out.println(stack.pop());
        }


    }
}
