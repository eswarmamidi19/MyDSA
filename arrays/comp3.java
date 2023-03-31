package arrays;

import java.util.*;
public class comp3 {
    public static void main(String[] args) {
        TreeSet<Integer> al = new TreeSet<>(new newComp1());
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(6);
        al.add(7);
        System.out.println(al);
    }
}

class newComp1 implements Comparator<Integer> {
      public int compare(Integer a,Integer b){
        return b-a;
      }
}
