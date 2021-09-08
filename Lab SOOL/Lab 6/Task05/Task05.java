public class Task05{
// insertion sort on doubly linked list
    public static void main (String[] args){
        Object[] num= {29, 11, 33, 14, 16, 22, 8, 48, 51, 37};
        DoublyList list= new DoublyList(num);
        list.forwardprint();
        
        Object key;
        Node x, y;
        
        for (x=list.head.next; x!=null; x=x.next){
            for (y=x.prev; y!= null; y=y.prev){
                if ((Integer)y.element <= (Integer)y.next.element) break;
                key= y.element;
                y.element= y.next.element;
                y.next.element= key;
            }
        }
        System.out.println("After applying insertion sort: ");
        list.forwardprint();
    }
}
