package algorithms.StackAndQuene;
import java.util.Stack;

public class getminStack {
/*
设计一个有getMin功能的栈
【题目】
    实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
【要求】
    1.pop,push,getMin操作的时间复杂度是O(1)
    2.设计的栈类型是我们自己实现的栈
*/
    private  Stack<Integer> minstack;
    private  Stack<Integer> datastack;

    public getminStack() {
        this.datastack = new Stack();
        this.minstack= new Stack();
    }

    /**入栈
     * @param item
     */
    public void push(int item){
        if(minstack.isEmpty()){
            minstack.push(item);
        }else if (item < (Integer) minstack.peek()){
                minstack.push(item);
        }
        datastack.push(item);
    }

    /**出栈
     * @return
     */
    public int  pop(){
        if(datastack.isEmpty()){
            throw  new RuntimeException("栈空!");
        }
        int value=datastack.pop();
        //如果出栈的是最小元素，则minstack也要出栈
        if(value==minstack.peek()){
            minstack.pop();
        }
        return value;
    }

    /**最小值
     * @return
     */
    public int getMin(){
        if(minstack.isEmpty()){
            throw new  RuntimeException("栈空!，无最小值");
        }
        return minstack.peek();
    }

    public static void main(String[] args) {
        getminStack minst=new getminStack();
        minst.push(5);
        System.out.println(minst.getMin());
        minst.push(4);
        System.out.println(minst.getMin());
        minst.push(1);
        System.out.println(minst.getMin());
        System.out.println(minst.pop());
        System.out.println(minst.getMin());
    }


}
