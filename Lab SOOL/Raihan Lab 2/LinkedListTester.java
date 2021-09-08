public class LinkedListTester{
    public static void main(String [] args){
        int[] a1 = {10, 20, 30, 40, 50, 60, 70};
        MyList m1 = new MyList(a1);
        m1.showList();
        System.out.println();
        
        
        System.out.println("Another LinkedList from the previously formed LinkedList");
        MyList m2 = new MyList(m1);
        m2.showList();
        System.out.println();
        
        
        System.out.println("The list m1 is empty ? :" + m1.isEmpty());
        System.out.println();
        
        
        m2.clear();
        System.out.println("Result of invoking clear() method on list m2");
        m2.showList();
        System.out.println();
        
        
        System.out.println("Result of invoking insert(new Node(10, null)) method on list m2");
        m2.insert(new Node(10, null));
        m2.showList();
        System.out.println();
        
        
        System.out.println("Result of invoking insert(35, 3) method on list m1");
        m1.insert(35, 3);
        m1.showList();
        System.out.println();
        
        System.out.println("Result of invoking remove(35) method on list m1");
        m1.remove(35);
        m1.showList();
        System.out.println();
        
        
        System.out.println("\n\n");
        
        
        /////******Task 3*****//////
        int[] a2 = {1, 2, 5, 3, 8};
        MyList m3 = new MyList(a2);
        m3.showList();
        System.out.println("Listing all the even numbers: ");
        MyList m4 = m3.findEven();
        m4.showList();
        System.out.println();
        
        
        System.out.println("Result of invoking the function contains(7) on list m3 if the element is present or not: " + m3.contains(7));
        
        m4.head = m3.copyList();
        m4.showList();
        System.out.println("Reversing this list");
        m4.reverseList();
        m4.showList();
        System.out.println();
        
        
        m3.showList();
        m3.sortList();
        System.out.println("The sorted list m3 is given below: ");
        m3.showList();
        System.out.println();
        
        
        System.out.println("The sum of the list m3 is : " + m3.sumList());
        System.out.println();
        
        m3.showList();
        MyList m5 = new MyList();
        m5.head = m3.copyList();
        System.out.println("The result of rotating the list using funciton rotate(\"left\", 2) : ");
        m3.rotate("left", 2);
        m3.showList();
        System.out.println("The result of rotating the list using funciton rotate(\"right\", 2) : ");
        m5.rotate("right", 2);
        m5.showList();
    }
    
}