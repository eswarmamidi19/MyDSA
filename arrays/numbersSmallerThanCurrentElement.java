package arrays;

public class numbersSmallerThanCurrentElement {
    public static void main(String[] args) {
        // 8 1 2 2 3
        // 4 0 1 1 3
        int[] arr = {8,1,2,2,3};
       int[] freq  = new int[9];
       for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
       }
        for (int i : freq) {
            System.out.print(i+"  ");
        }
        System.out.println();
        int[] lessEle  = new int[9];
        lessEle[0]= 0;
        for(int i=1;i<9;i++){
            lessEle[i]=lessEle[i-1]+freq[i-1];
        }
        for (int i : lessEle) {
            System.out.print(i+ "  ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(lessEle[arr[i]]+"  ");
        }
}
}