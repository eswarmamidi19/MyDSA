package arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int[] running = new int[5];
        running[0]= arr[0];
        for(int i=1;i<5;i++){
            running[i]= running[i-1]+arr[i];
        }
        for (int i : running) {
            System.out.print(i+ " ");
        }
    }
}
