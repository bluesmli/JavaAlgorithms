package algorithms.StackAndQuene;
import java.util.Stack;

public class twoStackQueue {

    /*两个栈实现一个队列
     * 思路：左边A栈，右边B栈
     * 1.A栈往B栈压入数据，要一次性把A栈数据一个一个都压入B栈
     * 2.如果B栈不为空，A栈绝对不能向B栈压入数据。
     */

    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public twoStackQueue() {
        stackPush=new Stack<Integer>();
        stackPop=new Stack<Integer>();
    }

    public void add(int item){
        stackPush.add(item);
    }

    /**
     * @return 返回对列第一个元素并删除
     */
    public  int poll(){
        if(stackPop.empty()&& stackPush.empty()){
            throw new RuntimeException("Queue  is empty !");
        }else if(stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();

    }

    /**
     * @return  返回对列第一个元素
     */
    public  int peek(){
        if(stackPop.empty()&& stackPush.empty()){
            throw new RuntimeException("Queue  is empty !");
        }else if(stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();

    }

    public static void main(String[] args) {

        twoStackQueue queue = new twoStackQueue();
        queue.add(2);
        queue.add(4);
        queue.add(7);
        queue.add(13);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
