package com.example.currentshows;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Show {

    String showTitle;
    ImageView imageView;
    String stationOrStreamingService;
    String nextEpisode;

    String IMDB_LINK;
    String SUBREDDIT_LINK;

    public Show(String showTitle, String stationOrStreamingService, String nextEpisode, String IMDB_LINK, String SUBREDDIT_LINK){
        this.showTitle = showTitle;
        this.stationOrStreamingService = stationOrStreamingService;
        this.nextEpisode = nextEpisode;
        this.IMDB_LINK = IMDB_LINK;
        this.SUBREDDIT_LINK = SUBREDDIT_LINK;
    }

    // TODO: Add HTML parser method to update next episode field


    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getStationOrStreamingService() {
        return stationOrStreamingService;
    }

    public void setStationOrStreamingService(String stationOrStreamingService) {
        this.stationOrStreamingService = stationOrStreamingService;
    }

    public String getNextEpisode() {
        return nextEpisode;
    }

    public void setNextEpisode(String nextEpisode) {
        this.nextEpisode = nextEpisode;
    }

    public String getIMDB_LINK() {
        return IMDB_LINK;
    }

    public void setIMDB_LINK(String IMDB_LINK) {
        this.IMDB_LINK = IMDB_LINK;
    }

    public String getSUBREDDIT_LINK() {
        return SUBREDDIT_LINK;
    }

    public void setSUBREDDIT_LINK(String SUBREDDIT_LINK) {
        this.SUBREDDIT_LINK = SUBREDDIT_LINK;
    }
}
