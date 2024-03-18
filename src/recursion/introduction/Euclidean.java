package src.recursion.introduction;

public class Euclidean {
    public int gcdSolver(int greaterNumber, int smallerNumber){
        if(greaterNumber%smallerNumber == 0){
            return smallerNumber;
        }
        return gcdSolver(smallerNumber, greaterNumber%smallerNumber);
    }
}