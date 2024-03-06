package src.structural.adapter.domain;

public class Video implements Media{

    private String fileName;

    public Video(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing media video name: "+fileName);
    }
}
