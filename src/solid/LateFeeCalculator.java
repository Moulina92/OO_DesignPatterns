package src.solid;

public class LateFeeCalculator {
    public double totalLateFeeCalculator(src.solid.domain.LateFeeCalculator[] items, int days){
        double totalLateFee = 0;
        for(src.solid.domain.LateFeeCalculator item: items){
            totalLateFee += item.calculateLateFee(days);
        }
        return totalLateFee;
    }
}
