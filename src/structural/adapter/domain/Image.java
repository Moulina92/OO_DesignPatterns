package src.structural.adapter.domain;

public class Image {

    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void display(){
        System.out.println("Showing the image:"+imageName);
    }
}
