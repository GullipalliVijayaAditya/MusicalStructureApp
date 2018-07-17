package com.example.android.musicalstructureapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new com.example.android.musicalstructureapp.TabFragmentArtists();
            case 1:
                return new com.example.android.musicalstructureapp.TabFragmentAlbums();
            case 2:
                return new com.example.android.musicalstructureapp.TabFragmentSongs();
            case 3:
                return new com.example.android.musicalstructureapp.TabFragmentGenres();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}