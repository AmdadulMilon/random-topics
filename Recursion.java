package recursion;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(sumOf(5));

    }
    static int sumOf(int n){
        if (n == 1)
            return 1;
        else
            return n + sumOf(n-1);
    }
}
