package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.musicalstructureapp.adapter.SongAdapter;
import com.example.android.musicalstructureapp.model.Artist;
import com.example.android.musicalstructureapp.model.Song;
import com.example.android.musicalstructureapp.util.Util;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtistActivity extends AppCompatActivity {

    @BindView(R.id.songs_img)
    ImageView imageView;

    @BindView(R.id.songs_title)
    TextView titleText;

    @BindView(R.id.songs_list_view)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_layout);

        ButterKnife.bind(this);

        Long artistId = getIntent().getLongExtra("artist_id", 0);

        Artist artist = Util.getArtistById(artistId);
        if (artist.getImageId() == null) {
            imageView.setImageResource(R.drawable.album_default);
        } else {
            imageView.setImageResource(artist.getImageId());
        }
        titleText.setText(artist.getName());
        List<Song> songList = Util.getSongsByArtist(artistId);

        SongAdapter adapter = new SongAdapter(this, songList);

        listView.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(true);
        }
    }
}