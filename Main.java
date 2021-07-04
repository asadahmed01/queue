import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    // Queue<Integer> q = new ArrayDeque<>();
    // q.add(10);
    // q.add(20);
    // q.add(30);
    // System.out.println(q);
    // reverseQueue(q);
    // System.out.println(q);

    // var q = new ArrayQueue();
    // q.enqueue(10);
    // q.enqueue(20);
    // q.enqueue(30);
    // q.enqueue(40);
    // q.enqueue(50);

    // System.out.println(q.isFull());
    // System.out.println(q);

    // q.enqueue(50);
    // System.out.println(q.isFull());
    // System.out.println(q);
    // q.display();
    // q.dequeue();
    // System.out.println(q.dequeue());
    // q.display();

    var q = new StackQueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println(q);
    q.dequeue();
    System.out.println(q);
  }

  public static void reverseQueue(Queue<Integer> q) {
    var stack = new Stack<Integer>();
    // push items of the queue to the stack
    while (!q.isEmpty()) {
      stack.push(q.remove());
    }

    // pop from the stack and push it to the queue
    while (!stack.isEmpty()) {
      q.add(stack.pop());
    }
  }
}