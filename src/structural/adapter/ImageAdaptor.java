package src.structural.adapter;

import src.structural.adapter.domain.Image;
import src.structural.adapter.domain.Media;

public class ImageAdaptor implements Media {

    private Image image;

    public ImageAdaptor(Image image) {
        this.image = image;
    }
    @Override
    public void play() {
        System.out.println("Image has been adopted inside media");
        image.display();
    }
}
