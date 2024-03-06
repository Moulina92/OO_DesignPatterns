package src.structural.adapter.domain;

public class Audio implements Media{
    private String fileName;

    public Audio(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing media audio name: "+ fileName);
    }
}
