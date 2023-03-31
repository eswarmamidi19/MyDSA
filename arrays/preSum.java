package arrays;

public class preSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] pre = new int[6];
        pre[0]=0;
        for(int i=1;i<6;i++){
            pre[i]=pre[i-1]+arr[i-1];
        }
        for (int i : pre) {
            System.out.print(i+"  ");
        }
    }
}
