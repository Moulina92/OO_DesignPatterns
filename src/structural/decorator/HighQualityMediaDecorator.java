package src.structural.decorator;

import src.structural.adapter.domain.Media;

public class HighQualityMediaDecorator extends MediaDecorator{
    public HighQualityMediaDecorator(Media mediaDecorator) {
        super(mediaDecorator);
    }

    public void play() {
        super.play();
        System.out.println("HighQuality media decorator playing");
    }
}
