package arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n=4;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-i-1] = temp;
        }
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }
}
