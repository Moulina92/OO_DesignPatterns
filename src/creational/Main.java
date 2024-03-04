package src.creational;

import src.creational.builder.Computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB","16GB")
                .setIsBluetoothEnabled(true)
                                        .build();

        System.out.println(computer);

    }
}
