import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
  private Stack<Integer> s1 = new Stack<>();
  private Stack<Integer> s2 = new Stack<>();

  public void enqueue(int item) {
    s1.push(item);
  }

  public int dequeue() {
    if (s1.empty() && s2.empty())
      throw new IllegalStateException();

    moveFromStack1ToStack2();

    return s2.pop();
  }

  public int peek() {
    if (s1.empty() && s2.empty())
      throw new IllegalStateException();

    moveFromStack1ToStack2();

    return s2.peek();
  }

  private void moveFromStack1ToStack2() {
    if (s2.isEmpty()) {
      while (!s1.empty()) {
        s2.push(s1.pop());

      }
    }
  }

  public boolean QueueIsEmpty() {
    return (s1.empty() && s2.empty());
  }

  public void display() {
    for (Integer integer : s1) {
      System.out.println(integer);
    }
  }

  @Override
  public String toString() {
    return Arrays.toString(s2.toArray());
  }

}
