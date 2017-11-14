import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Sorting {
    public static void main(String[] args) {
        int[] values = new int[]{8,2,11,6,3,6,5,13,4,7,1,9,0};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        Arrays.stream(values).parallel().forEach(value -> (value % 2 == 0 ? even : odd).add(value));
        Collections.sort(even);
        Collections.sort(odd);

       for(int input : values){
           //System.out.println(input % 2 == 0 ? even.remove(even.size() - 1) : odd.remove(0));
           if(input == 0){
               return;
           }
       else if(input % 2 == 0){
           System.out.print(even.remove(even.size()- 1) + " ");
       }
       else{
           System.out.print(odd.remove(0) + " ");
       }
       }
    }
    }