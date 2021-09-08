import java.io.ObjectInputValidation;

public class ArrayStack implements Stack {
  int size;
  int top;
  Object[] data;

  public ArrayStack() {
    size = 0;
    top = -1;
    data = new Object[5];
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void push(Object e) throws StackOverflowException {
    if (size < data.length) {
      data[size] = e;
      top = size;
      size++;
    } else
      throw new StackOverflowException();
  }

  public Object pop() throws StackUnderflowException {
    if (size == 0)
      throw new StackUnderflowException();
    else {
      Object temp = data[top];
      data[top] = null;
      top--;
      size--;
      return temp;
    }
  }

  public Object peek() throws StackUnderflowException {
    if (size == 0)
      throw new StackUnderflowException();
    else
      return data[top];
  }

  public String toString() {
    if (size == 0)
      return "Empty Stack";
    String temp = "";
    for (int i = top; i >= 0; i--) {
      temp += data[i] + " ";
    }
    return temp;
  }

  public Object[] toArray() {
    Object[] temp = new Object[size];
    for (int i = 0, j = top; i < size; i++) {
      temp[i] = data[j];
      j--;
    }
    return temp;
  }

  public int search(Object e) {
    int count = 0;
    for (int i = top; i >= 0; i--) {
      if (data[i].equals(e))
        return count;
      count++;
    }
    return -1;
  }

}