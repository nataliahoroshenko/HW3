package org.example.homework10.Task1;

public class Song {
    private String title;
    private double duration;
    private int trackNumber;

    public Song(String title, double duration, int trackNumber) {
        this.title = title;
        this.duration = duration;
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public int getTrackNumber() {
        return trackNumber;
    }
}
