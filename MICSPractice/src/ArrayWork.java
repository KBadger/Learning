import java.util.ArrayList;

public class ArrayWork {
    public static void main(String[] args) {
        int[] input = {4, 4, 20, 32, 10, -1};
        int n = 1;
        System.out.println("Case " + n + ": " + EggOrder(input));
    }

    private static int EggOrder(int[] input) {
        int current = input[0];
        int eggs = input[1];
        int closest = Math.abs(current - input[2]);
        ArrayList<Integer> egglocations = new ArrayList<Integer>();
        for (int i = 2; i < input.length - 2; i++) {
            egglocations.add(input[i]);
        }
        //Compare each index to the current position and find the smallest absolute value difference
        for(int i = 0; i < input.length - 2; i++){
            int ClosestObject = 0;
            for(int j = 0; j < egglocations.size(); i++){
                if(closest > Math.abs(current - egglocations.get(i))){
                    ClosestObject = egglocations.get(i);
                }
                current = ClosestObject;
                egglocations.remove(ClosestObject);
            }

        }

    return 0;}
}

