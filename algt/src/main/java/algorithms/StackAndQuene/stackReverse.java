package algorithms.StackAndQuene;

import java.util.Stack;

public class stackReverse {

/*
        如何仅用递归函数和栈逆序一个栈
*/

    private Stack<Integer> stackpop;
    private Stack<Integer> stackpush;

    public stackReverse() {
        this.stackpop=new Stack<Integer>();
        this.stackpush=new Stack<Integer>();
    }


    /**
     * 用两个栈实现逆序
     */
    public void popToPush(){
        Integer po=stackpop.pop();
        stackpush.push(po);
        if (!stackpop.isEmpty()){
            popToPush();
        }
    }

    private int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        }
        int last = getAndRemoveLastElement(stack);
        stack.push(result);
        return last;
    }

    /**
     * @param stack 一个栈实现逆序
     */
    private void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int last = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(last);
    }


    public static void main(String[] args) {
        stackReverse sre=new stackReverse();
        sre.stackpop.push(1);
        sre.stackpop.push(2);
        sre.stackpop.push(3);
        sre.stackpop.push(4);
        //sre.popToPush();
        sre.reverse(sre.stackpop);
        System.out.println(sre.stackpop.pop());
        System.out.println(sre.stackpop.pop());
        System.out.println(sre.stackpop.pop());
        System.out.println(sre.stackpop.pop());


    }
}
