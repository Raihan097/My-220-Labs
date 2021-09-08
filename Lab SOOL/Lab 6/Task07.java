import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class Task07{
    static Map<Integer, Integer> memo= new TreeMap<Integer, Integer>();
    
    static int memoizedFib(int n){
        if (n<2) return n;
        else if (memo.get(n)==null) memo.put(n, memoizedFib(n-1)+memoizedFib(n-2));
        return memo.get(n);
    }
    
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter the value of the n-th term whose fibonacci value is to be found out:");
        int n= sc.nextInt();
        sc.close();
        System.out.println("the fibonacci value of " + n + "th term is "+ memoizedFib(n));
    }
}
