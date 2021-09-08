public class Task02{
    
    static void insertionSort(int arr[], int n){
        if (n < 1)   return;
        
        insertionSort( arr, n-1 );
        swapIndex(arr, n-1);
    }
    
    static void swapIndex(int[] arr, int i){
        if ( i<0 ) return;
        if (arr[i] > arr[i+1]){
            int temp= arr[i+1];
            arr[i+1]= arr[i];
            arr[i]= temp;
            swapIndex(arr, i-1);
        } 
    }
    
    
    public static void main (String[] args){
        int[] num= {26, 16, 12, 10, 9, 7, 5, 4, 3, 2, 1};
        insertionSort( num, num.length-1);
        
        for (int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}