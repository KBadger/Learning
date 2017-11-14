import java.util.Arrays;

public class MoreArrays {

    public static void main(String[] args) {
     int[] input = {20, 45, 30, 5, 15, 50, 10, 35};

     for(int i = 0; i < input.length; i++){
     System.out.print(input[i] + " ");
     }
     System.out.println();
     int[] result = new int[input.length];
        result = ValleySort(input);
        for(int i = 0; i < input.length; i++){
            System.out.print(result[i] + " ");
        }

    }

    public static int[] ValleySort(int[] data){
        int[] store = new int[data.length];
        for(int i = 0; i < data.length; i++) {
            store[i] = data[i];
        }
        Arrays.sort(store);
        int counter = 0;
        int[] sorted = new int[data.length];
        for(int i = 0; i < data.length; i++){
            if(i%2 == 0){
                sorted[counter] = store[store.length - i - 1];
            }
            else{
                sorted[sorted.length - counter - 1] = store[store.length - i - 1];
            counter ++;}
        }

        return sorted;
    }
}
