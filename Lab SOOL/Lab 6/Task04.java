public class Task04{
// selection sort on singly linked list
    public static void main(String[] args){
        Object[] num= {29, 11, 33, 14, 16, 22, 8, 48, 51, 37};
        LinkedList list= new LinkedList(num);
        list.printList();
        
        int length= list.countNode();
        Object min;
        Node minNode= null;
        
        for (Node x= list.head; x.next!=null; x=x.next){
            min= x.element;
            minNode= x;
            for (Node y= x.next; y!=null; y=y.next){
                if ((Integer)min > (Integer)y.element){
                    min= y.element;
                    minNode= y;
                }
            }
            minNode.element= x.element;
            x.element= min;
        }
        System.out.println("After applying selection sort: ");
        list.printList();
    }
}