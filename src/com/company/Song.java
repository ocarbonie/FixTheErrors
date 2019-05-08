package com.company;

import java.util.ArrayList;

public class Song {
    private String artist;
    private String title;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void addSongs(){

    }
    public String display(){
        return (this.getTitle()+ " " + this.getTitle());

    }
}
