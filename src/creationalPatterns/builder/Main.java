package src.creationalPatterns.builder;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB","16GB")
                .setIsBluetoothEnabled(true)
                                        .build();

        System.out.println(computer);

    }
}
