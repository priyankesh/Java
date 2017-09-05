package Fibonacci;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private static List<Integer> memoList = new ArrayList<>();

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        memoList.add(0);
        for (int a = 0; a <= 10; a++)
            System.out.println(a + " Fibonacci: " + fib.fibo(a));
    }

    private int fibo(int n) {
        int f;
        if (n < memoList.size())
            return memoList.get(n);
        if (n <= 2) {
            f = 1;
        } else {
            f = fibo(n - 1) + fibo(n - 2);
        }
        memoList.add(f);
        return f;
    }
}