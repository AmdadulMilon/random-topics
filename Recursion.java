package recursion;

public class Recursion {
    public static void main(String[] args) {

        System.out.println("Sum of Natural Num: "+sumOf(5));
        System.out.println("Multiplication of Number: "+pow(3,9));

    }
    // First Recursion Sum of Natural Numbers
    static int sumOf(int n){
        if (n == 1)
            return 1;
        else
            return n + sumOf(n-1);
    }
    // Power of multiplication
    static int pow(int a, int b){
        if (b == 0)
            return 1;
        else
            return a * pow(a,b-1);
    }
}
