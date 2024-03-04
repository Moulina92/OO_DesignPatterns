package src.creationalPatterns.singleton;

public class Computer {
    private volatile static Computer instance;

    private Computer() {}

    public static Computer getInstance() {

        if (instance == null) {

            synchronized (Computer.class) {

                if (instance == null) {
                    instance = new Computer();
                }
            }
        }

        return instance;
    }
}
