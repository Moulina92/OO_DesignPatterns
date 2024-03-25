package src.bitmanipulation;

public class Run {
    public static void main(String[] args) {
        BitLengthOfInteger bitLengthOfInteger = new BitLengthOfInteger();
        System.out.println("Bit length of integer 2787 is: " + bitLengthOfInteger.getCount(2787,0));

        OddEvenNum oddEvenNum = new OddEvenNum();
        System.out.println(oddEvenNum.calculate(0));

        RussianPeasantRecursion recursion =  new RussianPeasantRecursion();
        System.out.println(recursion.calculate(43,7));
    }
}
