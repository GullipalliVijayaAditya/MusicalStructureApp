package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.musicalstructureapp.adapter.ArtistAdapter;
import com.example.android.musicalstructureapp.model.Artist;
import com.example.android.musicalstructureapp.util.Util;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragmentArtists extends Fragment {

    @BindView(R.id.artist_grid_view)
    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_fragment_artists, container, false);
        ButterKnife.bind(this, view);

        List<Artist> artistList = Util.getArtists();

        ArtistAdapter adapter = new ArtistAdapter(view.getContext(), artistList);

        gridView.setAdapter(adapter);

        return view;
    }

}