import java.util.Arrays;
import java.util.Scanner;

public class Fibanoci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println("Fibonaci using recursion: "+fib(num));
        System.out.println("Using Array to print : "+Arrays.toString(fibonaci(num)));
    }
    public static int fib(int n) {

        if(n==0 || n==1){
            return n;
        }
        return (fib(n-1)+fib(n-2));
    }

    protected static int[] fibonaci(int n) {
        int a=0,b=1;
        int sum = 0;
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = a;
            int c = a + b;
            a = b;
            b = c;
        }
        return arr;
    }
}
