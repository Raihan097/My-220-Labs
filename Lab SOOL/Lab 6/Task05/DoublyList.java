public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(a[0], null, null);
        Node tail = head;
        
        for(int i = 1; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
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
    public void forwardprint(){
        Node x;
        for (x=head; x.next!=null; x=x.next){
            System.out.print(x.element+", ");
        }
        System.out.println(x.element+".");
    }
    
    public void backwardprint(){
        Node x;
        for (x=head; x.next!=null; x=x.next);
        for ( ; x.prev!=head; x=x.prev){
            System.out.print(x.element+", ");
        }
        System.out.println(x.element+".");
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int count=0;
        Node x;
        for (x=head; x!=null; x=x.next){
            if ( count == idx){
                return x;
            }
            count++;
        }
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        Node x;
        int count=0;
        for (x=head; x!=null; x=x.next){
            if (x.element==elem){
                return count;
            }
            count++;
        }
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
       Node x;
       Node temp= new Node (elem, null, null);
       if (idx==0){
           temp.next=head;
           head.prev=temp;
           head=temp;
       }
       else{
           Node pre= nodeAt(idx-1);
           temp.next=pre.next;
           pre.next.prev=temp;
           pre.next=temp;
           temp.prev=pre;
       }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        Object temp= null;
        if (index==0){
            temp=head.element;
            head = head.next;
            head.prev = null;
        }
        else {
            Node pre= nodeAt(index-1);
            temp=pre.next.element;
            pre.next=pre.next.next;
            pre.next.prev=pre;
        }
        return temp; // please remove this line!
    }
    
}