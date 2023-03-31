package arrays;

/**
 * arraytonum
 */
public class arraytonum {
   public static void main(String[] args) {
      int[] num = {9,9,9,9,9,9,9,9,9,9};
       double sum =0;
        int j = num.length-1;
        for(int i=0;i<num.length;i++){
            sum+= num[i]*(int)Math.pow(10,j);
            j--;
        }
        System.out.println(sum);
   }
}