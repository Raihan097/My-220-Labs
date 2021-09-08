public class ListStack implements Stack {
  int size;
  Node top;

  public ListStack() {
    size = 0;
    top = null;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void push(Object e) throws StackOverflowException {
    if (size == 0) {
      top = new Node(e, null);
      size++;
    } else {
      Node temp = new Node(e, top);
      top = temp;
      size++;
    }
  }

  public Object pop() throws StackUnderflowException {
    if (size == 0)
      throw new StackUnderflowException();
    else {
      Object temp = top.val;
      top = top.next;
      size--;
      return temp;
    }
  }

  public Object peek() throws StackUnderflowException {
    if (size == 0)
      throw new StackUnderflowException();
    else
      return top.val;
  }

  public String toString() {
    if (size == 0)
      return "Empty Stack";
    String test = "";
    for (Node x = top; x != null; x = x.next) {
      test += x.val + " ";
    }
    return test;
  }

  public Object[] toArray() {
    Object[] temp = new Object[size];
    Node x;
    int i;
    for (x = top, i = 0; x != null; x = x.next, i++) {
      temp[i] = x.val;
    }
    return temp;
  }

  public int search(Object e) {
    int count = 0;
    for (Node x = top; x != null; x = x.next) {
      if (x.val.equals(e))
        return count;
      count++;
    }
    return -1;
  }
}