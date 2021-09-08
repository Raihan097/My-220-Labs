public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
      head = new Node(a[0], null);
      Node tail= head;
      for (int i=1; i<a.length; i++){
          Node temp= new Node (a[i], null);
          tail.next=temp;
          tail=tail.next;
      }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h)
  {
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
      int count=0;
      for (Node x=head; x!=null; x=x.next){
          count++;
      }
      return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
      Node x;
      for (x=head; x.next!=null; x=x.next){
          System.out.print(x.element+", ");
      }
      System.out.println(x.element+".");
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
      Node x=head;
      if (idx<0) {
          return null;
      }
      else {
          int count = 0;
          for (x = head; x!=null; x = x.next, count++){
              if (count==idx)
                  return x;
          }
      }
      return null;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
      Node x;
      if (idx<0) {
          return null;
      }
      else {
          int count = 0;
          for (x = head; x!=null; x = x.next, count++){
              if (count==idx)
                  return x.element;
          }
      }
      return null;
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
      Node x;
      Object temp=null;
      if (idx<0) {
          return null;
      }
      else{
          int count = 0;
          for (x = head; x!=null; x = x.next, count++) {
              if (count == idx) {
                  temp = x.element;
                  x.element = elem;
                  return temp;
              }
          }
      }
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
      Node x;
      int index=0;
      for(x=head; x!=null; x=x.next, index++){
          if (x.element==elem){
              return index;
          }
      }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
      Node x;
      for(x=head; x!=null; x=x.next){
          if (x.element==elem){
              return true;
          }
      }
    return false; // please remove this line!
  }

  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
      Node copyHead= null;
      Node copyTail= null;
      Node x;
      for (x=head; x!=null; x=x.next){
          Node temp= new Node(x.element, null);
          if (copyHead==null){
              copyHead= temp;
              copyTail= copyHead;
          }
          else{
              copyTail.next=temp;
              copyTail=copyTail.next;
          }
      }
    return copyHead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
      Node x=head;
      Node rHead= new Node(head.element, null), temp;
      for (x=head.next; x!=null; x=x.next){
          rHead= new Node(x.element, rHead);
      }
      return rHead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
      Node x=head;
      if (idx<0) {
      }
      else{
          Node temp= new Node (elem, null);
          if (idx==0){
              temp.next=x;
              head=temp;
          }
          else if(idx==countNode()){
              for(x=head; x.next!=null; x=x.next){
              }
              x.next=temp;
              temp.next=null;
          }
          else{
              Node previous= nodeAt(idx-1);
              temp.next=previous.next;
              previous.next=temp;
          }
      }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
      Object temp=null;
      if (index<0){
          return null;
      }
      else{
          Node rNode=null;
          if (index==0){
              rNode=head;
              temp=head.element;
              head=head.next;
          }
          else {
              Node previous=nodeAt(index-1);
              rNode=previous.next;
              temp=rNode.element;
              previous.next=rNode.next;
          }
          rNode.element=null;
          rNode.next=null;
          return temp;
      }
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
      Node x=head;
      Node temp=head;
      for (x=head; x.next!=null; x=x.next){
      }
      head=head.next;
      x.next=temp;
      temp.next=null;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
      Node previous=null;
      Node tail=head;
      while (tail.next!=null){
          previous=tail;
          tail=tail.next;
      }
      tail.next=head;
      head=tail;
      previous.next=null;
  }
}