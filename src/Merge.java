public class Merge {
    public static void main(String[] args) {
        int[] a =new int[]{2,4,6,3,66,224,44,9};
        int n =a.length;
        divide(a,0,n-1);
        for (int i =0 ; i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    private static void divide(int[] a, int s, int e) {
        if(s>=e){
            return;
        }
        int mid =s+(e-s)/2;
        divide(a,s,mid);
        divide(a,mid+1,e);
        conqure(a,s,mid,e);
    }

    private static void conqure(int[] a, int s, int mid, int e) {
        int mergeArray[] =new int[e-s+1];
        mid =s+(e-s)/2;
        int idx1= s;
        int idx2 =mid+1;
        int x =0;

        while (idx1<=mid && idx2<=e){
            if (a[idx1]<= a[idx2]){
                mergeArray[x] = a[idx1];
                x++; idx1++;
            }
            else {
                mergeArray[x] = a[idx2];
                x++; idx1++;
            }
        }
        while (idx1<=mid ){
            mergeArray[x] = a[idx1];
            x++; idx1++;
        }
        while (idx2 <= e){
            mergeArray[x] = a[idx2];
            x++; idx2++;
        }
        for (int i=0 , j =s; i<mergeArray.length;i++ ,j++){
            a[j] = mergeArray[i];
        }
    }
}
