import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Encryption {

    private static final List<Character> ALPHABET = IntStream.rangeClosed('A', 'Z').mapToObj(value -> (char) value).collect(Collectors.toList());
            int[] inputs = {31, 0, 33, 61, 62, 117, 30, 93, 121, 14, 29, 39, 50, 30, 2, 65, 88};
    ALPHABET.add(0, ' ');
    ALPHABET.addAll(Arrays.asList('.', '?', '\n'));
    for(int input : inputs) {
        System.out.print(ALPHABET.get(input % 30));
    }
 /*   public static void main(String[] args) {

        int[] input = {31, 0, 33, 61, 62};
        int[] remainder = new int[input.length];
        for (int j = 0; j < input.length; j++) {
            remainder[j] = input[j] % 30;
            System.out.println(remainder[j]);
        }
        System.out.println();
        String letterout = "";
        for (int i = 0; i < remainder.length; i++) {
            switch (remainder[i]) {
                case 1:
                    remainder[i] = 0;
                    letterout = " ";
                case 2:
                    remainder[i] = 1;
                    letterout = "A";
                case 3:
                    remainder[i] = 2;
                    letterout = "B";
                case 4:
                    remainder[i] = 3;
                    letterout = "C";
                    System.out.println(letterout);
            }
        }
*/
    }

