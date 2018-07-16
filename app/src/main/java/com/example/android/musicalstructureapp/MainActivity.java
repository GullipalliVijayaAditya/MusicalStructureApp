package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Layout that shows the Now Is Playing category
        LinearLayout nowIsPlaying = (LinearLayout) findViewById(R.id.nowIsPlaying);
        LinearLayout albums = (LinearLayout) findViewById(R.id.albums);
        LinearLayout artists = (LinearLayout) findViewById(R.id.artists);
        LinearLayout musicStore = (LinearLayout) findViewById(R.id.musicStore);
        LinearLayout settings = (LinearLayout) findViewById(R.id.settings);

        nowIsPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(MainActivity.this, com.example.android.musicalstructureapp.NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, Artist.class);
                startActivity(artistsIntent);
            }
        });

        musicStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(MainActivity.this, com.example.android.musicalstructureapp.MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(MainActivity.this, Settings.class);
                startActivity(settingsIntent);
            }
        });
    }
}