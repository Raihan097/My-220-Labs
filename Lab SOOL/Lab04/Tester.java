import java.text.BreakIterator;
import java.util.Scanner;

public class Tester {

  public static void bracketChecker(Stack st, String[] tests) throws Exception {
    for (int j = 0; j < tests.length; j++) {
      char[] temp = tests[j].toCharArray();
      for (int i = 0; i < temp.length; i++) {
        if (temp[i] == '(' || temp[i] == '{' || temp[i] == '[')
          st.push(temp[i]);
        else if (temp[i] == ')' && !st.isEmpty() && st.peek().equals('('))
          st.pop();
        else if (temp[i] == '}' && !st.isEmpty() && st.peek().equals('{'))
          st.pop();
        else if (temp[i] == ']' && !st.isEmpty() && st.peek().equals('['))
          st.pop();
      }
      System.out.println("\n" + tests[j]);
      if (st.isEmpty())
        System.out.println("This expression is correct.");
      else
        System.out.println("This expression is NOT correct.");
      while (!st.isEmpty())
        st.pop();
    }
  }

  public static void main(String[] args) throws Exception {
    String tester[] = { "1+2*(3/4)", "1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14",
        "1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14", "1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14" };

    Stack stack1 = new ArrayStack();
    System.out.println("\n\nThis is the results of the Array Based Stack implementation\n");
    bracketChecker(stack1, tester);

    Stack stack2 = new ListStack();
    System.out.println("\n\nThis is the results of the List Based Stack implementation\n");
    bracketChecker(stack2, tester);

  }
}