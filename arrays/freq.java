

public class freq {
    public static void main(String[] args) {
        int[] arr = {1,1,5,6,3,3,9,9,9};
        int[] fre = new int[10];
        for(int i=0;i<arr.length;i++){
            fre[arr[i]]++; 
        }
        for (int i : fre) {
            System.out.print(i+" ");
        }
    }
}
