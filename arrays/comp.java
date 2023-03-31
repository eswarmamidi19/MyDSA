package arrays;


import java.util.*;
public class comp {
       public static void main(String[] args) {
            ArrayList<Integer> al = new ArrayList<>();
             al.add(4);
             al.add(3);
             al.add(2);
             al.add(6);
             al.add(7);
            System.out.println(al);
            Collections.sort(
              al, new Comparator<Integer> (){
                @Override
                public int compare(Integer o1,Integer o2){
                    if(o1<o2){
                        return 1;
                    }
                    else if(o1>o2){
                        return -1;
                    }
                    return 0;
                }
              }
            );
         System.out.println(al);


       }
}

/*
 Collections.sort(
            elements, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2)
                {
                    // Changing the order of the elements
                    return o2 - o1;
                }
            });
 */