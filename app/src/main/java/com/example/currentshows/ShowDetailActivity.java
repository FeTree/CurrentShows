package com.example.currentshows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    Show mandalorian = new Show("The Mandalorian", "Station/Streaming Service: Disney Plus", "11/28", "https://www.imdb.com/title/tt8111088/", "https://www.reddit.com/r/TheMandalorianTV/");
    Show tgp = new Show("The Good Place", "Station/Streaming Service: Hulu", "11/27", "https://www.imdb.com/title/tt4955642/", "https://www.reddit.com/r/TheGoodPlace/");
    Show southPark = new Show("South Park", "Station/Streaming Service: Hulu", "11/28", "https://www.imdb.com/title/tt0121955/", "https://www.reddit.com/r/southpark/");
    Show siliconValley = new Show("Silicon Valley", "Station/Streaming Service: HBOgo", "11/28", "https://www.imdb.com/title/tt2575988/", "https://www.reddit.com/r/SiliconValleyHBO/");
    Show barry = new Show("Barry", "Station/Streaming Service: HBOgo", "11/28", "https://www.imdb.com/title/tt5348176/", "https://www.reddit.com/r/Barry/");


    //test github 555

    // fields
    TextView showTitle;
    ImageView imageView;
    TextView stationOrStreamingService;
    TextView nextEpisode;
    Button imdbButton;
    Button subredditButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        // connect
        showTitle = findViewById(R.id.theMandalorian);
        imageView = findViewById(R.id.imageView);
        stationOrStreamingService = findViewById(R.id.stationOrStreamingService);
        nextEpisode = findViewById(R.id.nextEpisode);
        imdbButton= findViewById(R.id.imdbButton);
        subredditButton = findViewById(R.id.subredditButton);

        // update name for clicked activity
        String showName = (String) getIntent().getExtras().get("showName");
        showTitle.setText(showName);

        // update station or streaming service
        if(showName.equals("The Mandalorian")){

            setDetail(mandalorian);

            // update image
            imageView.setImageResource(R.mipmap.mandalorian_foreground);
        }
        if(showName.equals("The Good Place")){

            setDetail(tgp);

            // update image
            imageView.setImageResource(R.mipmap.thegoodplace_foreground);
        }
        if(showName.equals("South Park")){

            setDetail(southPark);

            // update image
            imageView.setImageResource(R.mipmap.southparkpic_foreground);
        }
        if(showName.equals("Silicon Valley")){

            setDetail(siliconValley);

            // update image
            imageView.setImageResource(R.mipmap.siliconvalley_foreground);
        }
        if(showName.equals("Barry")){

            setDetail(barry);

            // update image
            imageView.setImageResource(R.mipmap.barry_foreground);
        }
    }

    public void setDetail(Show show){
        final Uri uriForIMDB = Uri.parse(show.getIMDB_LINK());
        final Uri uriForSubreddit = Uri.parse(show.getSUBREDDIT_LINK());

        stationOrStreamingService.setText(show.getStationOrStreamingService());
        nextEpisode.setText("Next episode: " + show.getNextEpisode());

        imdbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uriForIMDB);
                startActivity(intent);
            }
        });

        subredditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uriForSubreddit);
                startActivity(intent);
            }
        });
    }
}
