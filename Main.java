import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    var pq = new priorityQ();
    pq.enqueue(4);
    pq.enqueue(5);
    pq.enqueue(1);
    pq.enqueue(3);
    pq.enqueue(2);
    // pq.enqueue(6);
    System.out.println(pq);
    System.out.println(pq.remove());
    System.out.println(pq);
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