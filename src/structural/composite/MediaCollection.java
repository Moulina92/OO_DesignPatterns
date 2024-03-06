package src.structural.composite;

import src.structural.adapter.domain.Media;

import java.util.List;

public class MediaCollection implements Media {

    private List<Media> mediaList;

    public MediaCollection(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    @Override
    public void play() {
        for (Media media : this.mediaList) {
            media.play();
        }
    }

    public void addMedia(Media media){
        this.mediaList.add(media);
    }
}
