package src.structural;

import src.structural.adapter.ImageAdaptor;
import src.structural.adapter.domain.Audio;
import src.structural.adapter.domain.Image;
import src.structural.adapter.domain.Media;
import src.structural.adapter.domain.Video;
import src.structural.composite.MediaCollection;
import src.structural.decorator.HighQualityMediaDecorator;

import java.util.ArrayList;

public class MultimediaApp {

    public static void main(String[] args) {

        Media video = new Video("video.mp4");
        Media audio = new Audio("audio.mp3");
        Image image = new Image("image.png");
        Media imageAdaptor = new ImageAdaptor(image);

        Media highQualityDecorator = new HighQualityMediaDecorator(audio);

        MediaCollection allMedia = new MediaCollection(new ArrayList<>());
        allMedia.addMedia(video);
        allMedia.addMedia(highQualityDecorator);
        allMedia.addMedia(imageAdaptor);

        allMedia.play();
    }
}
