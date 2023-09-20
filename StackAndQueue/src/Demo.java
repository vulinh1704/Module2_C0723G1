import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Stack (Ngăn xếp): Là một cấu trúc dữ liệu làm việc theo nguyên lý LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(9);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.search(5));


        // Queue (Hàng đợi): Là cấu trúc dữ liệu làm việc theo nguyên lý FIFO (Vào đầu, ra đầu)
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(9);
//        queue.add(7);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());


//        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
//        queue.add(1);
//        queue.add(9);
//        queue.add(7);
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());


        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(1);
        dequeue.add(9);
        dequeue.add(7);
        dequeue.add(10);

        /*
        11
        1
        9
        7
        10
         */

//        System.out.println(dequeue.pollFirst());
//        System.out.println(dequeue.pollLast());
        dequeue.addFirst(11);
        System.out.println(dequeue.peek());
    }
}

class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> a = new HashMap<>();
        a.put(4, 56);
        a.put(1, 100);
        a.put(9, 78);
        System.out.println(a);
        a.replace(9, 0);
        System.out.println(a);
    }
}
