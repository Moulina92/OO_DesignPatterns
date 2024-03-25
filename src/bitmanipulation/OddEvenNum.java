package src.bitmanipulation;

public class OddEvenNum {
   public String calculate(int number){

       if((number^1) == number-1)
           return number +" is an odd number";
       return number + " is an even number";
   }
}
