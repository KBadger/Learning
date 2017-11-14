public class Dynamic {
    public static void main(String[] args) {
        System.out.println(Fib(26));
    }
    static int Fib(int n){
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<n+1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
