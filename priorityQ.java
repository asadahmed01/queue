import java.util.Arrays;

public class priorityQ {
  private int[] items = new int[5];
  private int count;

  public void enqueue(int item) {
    int i;
    if (count == items.length)
      throw new IllegalStateException();
    for (i = count - 1; i >= 0; i--) {
      if (items[i] > item) {
        items[i + 1] = items[i];
      } else
        break;
    }

    items[i + 1] = item;
    count++;

  }

  public int remove() {
    if (count == 0)
      throw new IllegalStateException();
    var item = items[--count];
    items[count] = 0;
    return item;
  }

  @Override
  public String toString() {
    return Arrays.toString(items);
  }

}
