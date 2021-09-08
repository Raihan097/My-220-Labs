public class DoublyList {
  public Node head;

  public DoublyList(int[] a) {
    if (a.length != 0) {
      head = new Node(0, null, null);
      Node tail = head;

      for (int i = 0; i < a.length; i++) {
        Node mn = new Node(a[i], null, null);
        tail.next = mn;
        mn.prev = tail;
        tail = tail.next;
      }
      tail.next = head;
      head.prev = tail;
    }
  }

  public DoublyList(Node h) {
    head = h;
  }

  public int countNode() {
    int count = 0;
    for (Node x = head.next; x != head; x = x.next) {
      count++;
    }
    return count;
  }

  public void showList() {
    if (head.next == null) {
      System.out.println("Empty List!");
      return;
    }
    Node x;
    for (x = head.next; x.next != head; x = x.next) {
      System.out.print(x.element + ", ");
    }
    System.out.println(x.element + ".");
  }

  public Node nodeAt(int idx) {
    int count = 0;
    Node x;
    for (x = head.next; x != head; x = x.next) {
      if (count == idx) {
        return x;
      }
      count++;
    }
    return null;
  }

  public int indexOf(int newElement) {
    Node x;
    int count = 0;
    for (x = head.next; x != head; x = x.next) {
      if (x.element == newElement) {
        return count;
      }
      count++;
    }
    return -1;
  }

  public void insert(Node newElement) {
    Node x = head.next;
    for (; x.next != head; x = x.next) {
      if (x.element == newElement.element) {
        System.out.println("This element already exists in the List!");
        return;
      }
    }
    x.next = newElement;
    newElement.prev = x;
    newElement.next = head;
    head.prev = newElement;
  }

  public void insert(int newElement, int index) {
    if (head.next == null) {
      System.out.println("Empty list! Insert at specific index not possible");
      return;
    }
    Node temp = new Node(newElement, null, null);
    if (index == 0) {
      temp.next = head.next;
      head.next.prev = temp;
      head.next = temp;
      temp.prev = head;
    } else {
      Node pre = nodeAt(index - 1);
      temp.next = pre.next;
      pre.next.prev = temp;
      pre.next = temp;
      temp.prev = pre;
    }
  }

  public void remove(int index) {
    if (head.next != null) {
      System.out.println("Empty List! Nothing to remove!");
      return;
    }
    Object temp = null;
    if (index == 0) {
      temp = head.next.element;
      head.next = head.next.next;
      head.next.prev = head;
    } else {
      Node pre = nodeAt(index - 1);
      temp = pre.next.element;
      pre.next = pre.next.next;
      pre.next.prev = pre;
    }
  }

  public int removeKey(int deleteKey) {
    if (head.next != null) {
      System.out.println("Empty List! Nothing to remove!");
      return 0;
    }
    Node pred = head, current = head.next;
    for (; current.next != null; pred = current, current = current.next) {
      if (current.element == deleteKey)
        break;
    }
    current.next.prev = pred;
    pred.next = current.next;
    current = null;
    return deleteKey;
  }
}