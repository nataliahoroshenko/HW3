package org.example.homework10.Task1;

import java.util.ArrayList;
import java.util.List;

class Album {
    private String title;
    private SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public boolean addSong(Song song) {
        return songList.addSong(song);
    }

    public Song findSongByTitle(String title) {
        return songList.findSongByTitle(title);
    }

    public Song findSongByTrackNumber(int trackNumber) {
        return songList.findSongByTrackNumber(trackNumber);
    }

    private class SongList {
        private List<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (!songs.contains(song)) {
                songs.add(song);
                return true;
            }
            return false;
        }

        public Song findSongByTitle(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSongByTrackNumber(int trackNumber) {
            for (Song song : songs) {
                if (song.getTrackNumber() == trackNumber) {
                    return song;
                }
            }
            return null;
        }
    }
}


