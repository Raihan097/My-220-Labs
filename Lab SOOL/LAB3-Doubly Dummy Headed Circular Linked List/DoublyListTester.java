public class DoublyListTester {
  public static void main(String[] args) {

    int[] a1 = { 10, 20, 30, 40 };
    DoublyList h1 = new DoublyList(a1);

    System.out.println("\n/////  Test 01 & Test 02  /////");
    h1.showList(); // This should print: 10,20,30,40.

    System.out.println("\n/////  Test 03  /////");
    h1.insert(new Node(55, null, null));
    h1.showList(); // This should print: 10,20,30,40,55;

    h1.insert(new Node(30, null, null)); // This should print: "This element already exists in the List!"

    System.out.println("\n/////  Test 04  /////");
    int[] a2 = { 10, 20, 30, 40 };
    DoublyList h2 = new DoublyList(a2);
    System.out.println("Current condition of the new list: ");
    h2.showList();
    System.out.println();

    h2.insert(85, 0);
    System.out.println("Inserting element at index: 0");
    h2.showList(); // This should print: 85,10,20,30,40.
    System.out.println();

    System.out.println("Inserting element at index: 3");
    h2.insert(95, 3);
    h2.showList(); // This should print: 85,10,20,95,30,40.
    System.out.println();

    System.out.println("Inserting element at index: 6");
    h2.insert(75, 6);
    h2.showList(); // This should print: 85,10,20,95,30,40,75.
    System.out.println();

    System.out.println("\n/////  Test 05  /////");
    int[] a3 = { 10, 20, 30, 40, 50, 60, 70 };
    DoublyList h3 = new DoublyList(a3);
    h3.showList(); // This should print: 10,20,30,40,50,60,70.
    System.out.println();

    System.out.println("Removed element at index: 0");
    h3.remove(0); // This should print: Removed element: 10
    h3.showList(); // This should print: 20,30,40,50,60,70.
    System.out.println();

    System.out.println("Removed element at index: 3");
    h3.remove(3); // This should print: Removed element: 50
    h3.showList(); // This should print: 20,30,40,60,70.
    System.out.println();

    System.out.println("\n/////  Test 06  /////");
    System.out.println("Removed element: 40");
    h3.removeKey(40);
    h3.showList(); // This should print: 20, 30, 60, 70
    System.out.println();

  }

}