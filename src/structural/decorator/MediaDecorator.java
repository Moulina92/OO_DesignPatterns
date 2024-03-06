package src.structural.decorator;

import src.structural.adapter.domain.Media;

public abstract class MediaDecorator implements Media {

    protected Media mediaDecorator;

    protected MediaDecorator(Media mediaDecorator) {
        this.mediaDecorator = mediaDecorator;
    }
    public void play() {
      this.mediaDecorator.play();
    }
}
