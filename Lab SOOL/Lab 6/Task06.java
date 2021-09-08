public class Task06{
    
    static int binSearch(int[] arr, int st, int end, int key){
        int mid= (st+end)/2;
        if (key == arr[mid]) return mid;
        else if (key < arr[mid]) return binSearch(arr, st, mid-1, key);
        else return binSearch(arr, mid+1, end, key);
    }
    
    public static void main (String[] args){
        int[] num= {8, 11, 14, 16, 22, 29, 33, 37, 48, 51};
        
        System.out.println(binSearch(num, 0, num.length-1, 22));
    }
}