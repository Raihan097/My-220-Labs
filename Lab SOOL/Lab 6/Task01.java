public class Task01{
    
    static void selectionSort(int[] arr, int pos){
        if (pos >= arr.length-1) return;
        
        int m= minIndex(arr, pos);
        if (m != pos){
            int temp= arr[m];
            arr[m]= arr[pos];
            arr[pos]= temp;
        }
        selectionSort(arr, pos+1);
    }
    
    
    static int minIndex(int[] temp, int i){
        if (i == temp.length-1) return i;
        
        int k= minIndex( temp, i+1);
        
        if (temp[i] < temp[k]) return i;
        else return k;
    }
    
   
    public static void main (String[] args){
        int[] num= {46, 56, 48, 59, 12, 23, 50, 79, 95, 42, 13, 35, 67, 91, 65};
        selectionSort( num, 0);
        
        for (int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}