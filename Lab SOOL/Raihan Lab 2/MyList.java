public class MyList{
    public Node head;
    
    
    ////****    Task 2    ****////
    public MyList(){
        head = null;
    }
    
    public MyList(int [] a){
        head = new Node(a[0], null);
        Node tail= head;
        for (int i=1; i<a.length; i++){
            Node temp= new Node (a[i], null);
            tail.next=temp;
            tail=tail.next;
        }
    }
    
    public MyList(Node h){
        head=h;
    }
    
    public MyList (MyList list){
        head = list.head;
    }
    
    public void showList(){
        Node x = head;
        if (x == null){
            System.out.println("Empty List");
            return;
        }
        for (; x.next!=null; x=x.next){
            System.out.print(x.element+", ");
        }
        System.out.println(x.element+".");
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void clear(){
        if (head == null) return;
        head = null;
    }
    
    public void insert(Node newElement){
        if (contains(newElement.element)) return;
        else if (head == null){
            head = newElement;
            return;
        }
        Node x = head;
        for ( ; x.next!=null; x = x.next);
        x.next = newElement;
    }
    
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
    
    public void insert(int newElement, int index){
        Node x=head;
        if (index < 0 || contains(newElement)) {
        }
        else{
            Node temp= new Node (newElement, null);
            if (index==0){
                temp.next=x;
                head=temp;
            }
            else if(index==countNode()){
                for(x=head; x.next!=null; x=x.next){
                }
                x.next=temp;
                temp.next=null;
            }
            else{
                Node previous= nodeAt(index-1);
                temp.next=previous.next;
                previous.next=temp;
            }
        }
    }
    
    public int remove(int deleteKey){
        int temp = 0;
        if (!contains(deleteKey)){
            return temp;
        }
        else{
            if (head.element == deleteKey){
                head = head.next;
            }
            else {
                Node prev = null;
                Node x = head;
                while (x.element != deleteKey){
                    prev = x;
                    x = x.next;
                }
                temp = x.element;
                prev.next = x.next;
            }
            return temp;
        }
    }
    
    
    ////****    Task 3   ****////
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
        return copyHead;
    }
    
    
    
    
    
    public MyList findEven(){
        MyList evenOnly = new MyList();
        for (Node x = head; x != null; x=x.next){
            if (x.element % 2 == 0){
                evenOnly.insert(new Node(x.element, null));
            }
        }
        return evenOnly;
    }
    
    public boolean contains(int elem){
        Node x;
        for(x=head; x!=null; x=x.next){
            if (x.element==elem){
                return true;
            }
        }
        return false;
    }
    
    public Node reverseList(){
        Node temp = head.next;
        Node x = temp.next;
        Node rHead = head;
        rHead.next = null;
        for ( ; x != null; x = x.next){
            temp.next = rHead;
            rHead = temp;
            temp = x;
        }
        temp.next = rHead;
        rHead = temp;
        
        head = rHead;
        return rHead;
    }
    
    public int countNode(){
        int count = 0;
        for (Node x = head; x != null; x = x.next){
            count++;
        }
        return count;
    }
    
    public void sortList(){
        int n = countNode();
        for (int i = 0; i < n; i++){
            for (Node prev = head, cur = head.next; cur != null; prev = cur, cur = cur.next){
                if (prev.element > cur.element){
                    int temp = prev.element;
                    prev.element = cur.element;
                    cur.element = temp;
                }
            }
        }
    }
    
    public int sumList(){
        int sum = 0;
        for (Node x = head; x != null; x = x.next){
            sum = sum + x.element;
        }
        return sum;
    }
    
    public void rotate(String direction, int n){
        if (direction.equals("left")){
            for (int i=0; i<n; i++){
                rotateLeft();
            }
        } else if (direction.equals("right")) {
            for (int i=0; i<n; i++){
                rotateRight();
            }
        }
    }
    
    public void rotateLeft(){
        Node x=head;
        Node temp=head;
        for (x=head; x.next!=null; x=x.next){
        }
        head=head.next;
        x.next=temp;
        temp.next=null;
    }
    
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