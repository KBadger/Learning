public class Recursion {
    public static void main(String[] args) {
    System.out.println(recM(5));
    }

    public static int recM(int n){
        if(n < 3) return n;
        if (n == 3) return 10;
        return recM(n-2) - recM(n-4) + recM(n-5) - recM(n-8);
    }
}
