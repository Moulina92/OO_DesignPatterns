package src.recursion.introduction;

public class HeadTailRecursion {
    public int headFactorial(int n) {

        if (n == 1) {
            System.out.println("Inside the base case " + n);
            return n;
        }
        System.out.println("Going to call head factorial with n: " + n);
        int res = n * headFactorial(n - 1);
        System.out.println("Head factorial result is: " + res);
        return res;
    }

    public int tailFactorial(int n, int acc) {
        if (n == 1) {
            System.out.println("Inside the base case " + acc);
            return acc;
        }
        System.out.println("Going to call tail factorial with n: " + n);
        int res = tailFactorial(n - 1, n * acc);
        System.out.println("Tail factorial result is: " + res);
        return res;
    }

}
