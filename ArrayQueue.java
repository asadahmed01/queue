import java.util.Arrays;

public class ArrayQueue {
  int[] arr = new int[5];
  int count;
  int rear;
  int front;

  public void enqueue(int item) {
    if (count == arr.length)
      throw new IllegalStateException("queue is full");
    arr[rear] = item;
    rear = (rear + 1) % arr.length;
    count++;
  }

  public int dequeue() {
    int item = arr[front];
    arr[front] = 0;
    front = (front + 1) % arr.length;
    return item;

  }

  public boolean isFull() {
    return count == arr.length;
  }

  @Override
  public String toString() {
    return Arrays.toString(arr);
  }
}
