package com.example.android.musicalstructureapp.util;

import com.example.android.musicalstructureapp.R;
import com.example.android.musicalstructureapp.model.Album;
import com.example.android.musicalstructureapp.model.Artist;
import com.example.android.musicalstructureapp.model.Genre;
import com.example.android.musicalstructureapp.model.Song;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static final Genre folk_rock = new Genre(1L, "Folk Rock");
    public static final Genre drum_and_bass = new Genre(2L, "Drum and Bass");
    public static final Genre blues = new Genre(3L, "Blues");
    public static Artist mumford = new Artist(1L, "Mumford & Sons", R.drawable.mumford);
    public static Artist rudimental = new Artist(2L, "Rudimental", R.drawable.rudimental);
    public static Artist lost_frequencies = new Artist(3L, "Lost Frequencies", null);
    public static Artist sigma = new Artist(4L, "Sigma", R.drawable.sigma);
    public static Artist gramatik = new Artist(5L, "Gramatik", R.drawable.gramatik);
    public static Artist netsky = new Artist(6L, "Netsky", R.drawable.netsky);
    public static Artist george_ezra = new Artist(7L, "George Ezra", null);
    public static Artist gregory_porter = new Artist(8L, "Gregory Porter", R.drawable.porter);
    public static Album mumford_album_1 = new Album(1L, mumford, "Wilder mind", null);
    public static Album mumford_album_2 = new Album(2L, mumford, "Babel", null);
    public static Album george_ezra_album_1 = new Album(3L, george_ezra, "Wanted on Voyage", null);
    public static Album netsky_album_1 = new Album(4L, netsky, "Netsky", null);

    public static List<Artist> getArtists() {
        List<Artist> artistList = new ArrayList<>();
        artistList.add(mumford);
        artistList.add(rudimental);
        artistList.add(lost_frequencies);
        artistList.add(sigma);
        artistList.add(gramatik);
        artistList.add(netsky);
        artistList.add(george_ezra);
        artistList.add(gregory_porter);

        return artistList;
    }

    public static Artist getArtistById(Long artistId) {
        Artist found = null;
        List<Artist> artists = getArtists();
        for (Artist artist : artists) {
            if (artist.getId().equals(artistId)) {
                found = artist;
                break;
            }
        }
        return found;
    }

    public static List<Album> getAlbums() {

        List<Album> albumList = new ArrayList<>();
        albumList.add(mumford_album_1);
        albumList.add(mumford_album_2);
        albumList.add(george_ezra_album_1);
        albumList.add(netsky_album_1);

        return albumList;
    }

    public static Album getAlbumById(Long albumId) {
        Album found = null;
        List<Album> albums = getAlbums();
        for (Album album : albums) {
            if (album.getId().equals(albumId)) {
                found = album;
                break;
            }
        }
        return found;
    }

    public static List<Genre> getGenres() {
        List<Genre> genreList = new ArrayList<>();
        genreList.add(folk_rock);
        genreList.add(blues);
        genreList.add(drum_and_bass);

        return genreList;
    }

    public static Genre getGenreById(Long genreId) {
        Genre found = null;
        List<Genre> genres = getGenres();
        for (Genre genre : genres) {
            if (genre.getId().equals(genreId)) {
                found = genre;
                break;
            }
        }
        return found;
    }

    public static List<Song> getSongs() {
        List<Song> songList = new ArrayList<>();

        songList.add(new Song(1L, mumford, mumford_album_1, "Tompkins Square Park", 312L, folk_rock));
        songList.add(new Song(2L, mumford, mumford_album_1, "Believe", 220L, folk_rock));
        songList.add(new Song(3L, mumford, mumford_album_1, "The Wolf", 221L, folk_rock));
        songList.add(new Song(4L, mumford, mumford_album_1, "Wilder Mind", 278L, folk_rock));
        songList.add(new Song(5L, mumford, mumford_album_1, "Just Smoke", 190L, folk_rock));
        songList.add(new Song(6L, mumford, mumford_album_1, "Monster", 236L, folk_rock));
        songList.add(new Song(6L, mumford, mumford_album_2, "Ghosts That We Knew", 339L, null));

        songList.add(new Song(7L, rudimental, null, "Feel The Love", 245L, drum_and_bass));

        songList.add(new Song(8L, gregory_porter, null, "Hey Laura", 212L, blues));

        songList.add(new Song(9L, null, null, "Fly", 316L, null));

        songList.add(new Song(10L, george_ezra, george_ezra_album_1, "Budapest", 200L, folk_rock));
        songList.add(new Song(11L, george_ezra, george_ezra_album_1, "Blame It on Me", 195L, null));

        songList.add(new Song(12L, netsky, netsky_album_1, "Gravity", 269L, drum_and_bass));

        songList.add(new Song(13L, lost_frequencies, null, "Here With You", 161L, null));

        songList.add(new Song(14L, sigma, null, "Nobody to Love", 243L, drum_and_bass));

        songList.add(new Song(15L, gramatik, null, "Balkan Express", 212L, null));

        return songList;
    }

    public static Song getSongById(Long songId) {
        Song found = null;
        List<Song> songs = getSongs();
        for (Song song : songs) {
            if (song.getId().equals(songId)) {
                found = song;
                break;
            }
        }
        return found;
    }

    public static List<Song> getSongsByArtist(Long artistId) {
        List<Song> filtered = new ArrayList<>();
        List<Song> songs = getSongs();
        for (Song song : songs) {
            if (song.getArtist() != null && song.getArtist().getId().equals(artistId)) {
                filtered.add(song);
            }
        }
        return filtered;
    }

    public static List<Song> getSongsByAlbum(Long albumId) {
        List<Song> filtered = new ArrayList<>();
        List<Song> songs = getSongs();
        for (Song song : songs) {
            if (song.getAlbum() != null && song.getAlbum().getId().equals(albumId)) {
                filtered.add(song);
            }
        }
        return filtered;
    }

    public static List<Song> getSongsByGenre(Long genreId) {
        List<Song> filtered = new ArrayList<>();
        List<Song> songs = getSongs();
        for (Song song : songs) {
            if (song.getGenre() != null && song.getGenre().getId().equals(genreId)) {
                filtered.add(song);
            }
        }
        return filtered;
    }
}