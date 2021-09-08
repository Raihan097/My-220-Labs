public class Task03{
// bubble sort on singly linked list
    public static void main(String[] args){
        Object[] num= {29, 11, 33, 14, 16, 22, 8, 48, 51, 37};
        LinkedList list= new LinkedList(num);
        list.printList();
        
        int length= list.countNode();
        Object temp;
        
        for (int i=0; i<length; i++){
            Node x=list.head;
            for ( ; x.next!=null; x=x.next){
                if ((Integer)x.element > (Integer)x.next.element){
                    temp= x.element;
                    x.element= x.next.element;
                    x.next.element= temp;
                }
            }
        }
        System.out.println("After applying bubble sort");
        list.printList();
    }
}

