import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,2,5,3,67};

        for (int i =0; i<a.length; i++){
            for (int j = i+1 ; j< a.length-1;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}