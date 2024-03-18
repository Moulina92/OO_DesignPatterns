package src.recursion.introduction;

public class Runner {
    public static void main(String[] args) {
        //Fibonacci
        System.out.println(new Fibonacci().solve(10, 0, 1));

        //Factorial
        System.out.println("*** Understand head recursion ***");
        new HeadTailRecursion().headFactorial(5);
        System.out.println("*** Understand tail recursion ***");
        new HeadTailRecursion().tailFactorial(5, 1);

        //TowerOfHanoi
        new TowerOfHanoi().solve(2, 'A', 'B', 'C');

        //ReverseOfString
        System.out.println("Reverse of String:" + new ReverseOfString().reverse("Kevin"));

        //Euclidean Greatest Common Divisor
        System.out.println("Greatest Common Divisor is : " + new Euclidean().gcdSolver(45,10));
    }
}
