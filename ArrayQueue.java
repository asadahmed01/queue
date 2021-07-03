import java.util.Arrays;

public class ArrayQueue {
  int[] arr = new int[5];
  int count;
  int rear;

  public void enqueue(int item) {
    if (count == arr.length)
      throw new IllegalStateException("queue is full");
    arr[rear++] = item;
    count++;
  }

  // public int dequeue() {

  // return arr[rear];

  // }

  @Override
  public String toString() {
    return Arrays.toString(arr);
  }
}
