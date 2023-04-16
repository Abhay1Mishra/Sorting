public class Quick {
    public static void main(String[] args) {
        int[] a  = new int[]{1,3,25,9,56};
        int n = a.length;
        quick(a,0,n-1);
        for (int i = 0; i<n;i++ ){
            System.out.print(a[i] +" ");
        }
        System.out.println(" ");
    }

    private static void quick(int[] a, int s, int e) {
        if(s>=e){
            return;
        }
        int p = partition(a,s,e);
        quick(a,s,p);
        quick(a,p+1,e);

    }

    private static int partition(int[] a, int s, int e) {
        int pivet =a[s];
        int count = 0;
        for (int i =s+1;i<e;i++){
            if(a[i]<=pivet){
                count++;
            }
        }
        int partition =s+count;
        int temp = a[s];
        a[s] = a[partition];
        a[partition] =temp;

        int i =s, j=e;
        while (i< partition && j> partition ){

            while (a[i]<=partition){
                i++;
            }
            while (a[j]>partition){
                j--;
            }
            if(i< partition && j> partition ){
                int temp2 = a[i];
                a[i] = a[j];
                a[j] =temp;
                j--;
                i++;
            }
        }
        return partition;
    }
}
