package src.bitmanipulation;

public class BitLengthOfInteger {
    public int getCount(int number, int count){
        if(number == 0) return count;
        return getCount(number>>1, count+1);
    }

}
