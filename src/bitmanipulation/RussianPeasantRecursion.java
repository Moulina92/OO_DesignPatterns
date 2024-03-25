package src.bitmanipulation;

/*
   c x b = (c*2) x (b/2)
   If b is even number then : 5 x 6 = 10 x 3 = 30
   c x b = {(c*2) x (b/2)} +c
   If b is odd number then : 5 x 7 = (10 x 3) + 5 = 35
 */
public class RussianPeasantRecursion {
    public int calculate(int a, int b){
        if(b == 0) return 0;
        if(b%2 == 1) return calculate(a*2, b/2) + a;
        return calculate(a*2, b/2);
    }

}
