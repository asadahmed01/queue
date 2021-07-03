import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import javax.sound.sampled.ReverbType;

public class Main {
  public static void main(String[] args) {
    Queue<Integer> q = new ArrayDeque<>();
    q.add(10);
    q.add(20);
    q.add(30);
    System.out.println(q);
    reverseQueue(q);
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