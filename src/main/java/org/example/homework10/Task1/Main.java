package org.example.homework10.Task1;

public class Main {
    public static void main(String[] args) {
        Album myAlbum = new Album("My Awesome Album");

        myAlbum.addSong(new Song("Song 1", 3.5, 1));
        myAlbum.addSong(new Song("Song 2", 4.2, 2));
        myAlbum.addSong(new Song("Song 3", 3.8, 3));

        Song foundSong = myAlbum.findSongByTitle("Song 3");
        if (foundSong != null) {
            System.out.println("Found song: " + foundSong.getTitle());
        } else {
            System.out.println("Song not found.");
        }

        foundSong = myAlbum.findSongByTrackNumber(3);
        if (foundSong != null) {
            System.out.println("Found song (track 3): " + foundSong.getTitle());
        } else {
            System.out.println("Song not found.");
        }
    }
}
