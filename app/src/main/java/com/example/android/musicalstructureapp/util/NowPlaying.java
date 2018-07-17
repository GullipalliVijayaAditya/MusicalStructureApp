package com.example.android.musicalstructureapp.util;

import com.example.android.musicalstructureapp.model.Song;

public enum NowPlaying {

    INSTANCE;

    Song song; //= new Song(20L, null, null, "My melody", null, null);
    Boolean paused = Boolean.FALSE;

    public Song getSong() {
        return this.song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public void switchPaused() {
        paused = !paused;
    }
}