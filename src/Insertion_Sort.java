import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] a  = new int[]{1,3,25,3,56};
        int n = a.length;
        for (int i = 1; i<n;i++){
            int temp = a[i];
            int j =i-1;
           for (;j>=0;j--){
               if(a[j]>a[i]){
                   a[j+1] =a[j];
               }
               else {
                   break;
               }
           }
           a[j+1] =temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
