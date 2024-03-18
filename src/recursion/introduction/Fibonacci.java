package src.recursion.introduction;

public class Fibonacci {
    public int solve(int n, int a, int b){
        if(n == 0) return a;
        if(n == 1) return b;
        return solve(n-1, b, a+b);
    }

}