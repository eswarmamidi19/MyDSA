package arrays;


import java.util.*;
public class comp2 {
    public static void main(String[] args) {
         ArrayList<Integer> al = new ArrayList<>();
         al.add(9);
         al.add(4);
         al.add(6);
         al.add(12);
         al.add(7);
         System.out.println(al);
         Collections.sort(al,new CustomClass());
         System.out.println(al);

    }
    
}
class CustomClass implements Comparator<Integer>{
     @Override
     public int compare(Integer o1,Integer o2){
        return o2-o1;
     }
}