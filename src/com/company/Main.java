package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
            Song s = new Song();
            System.out.println("Please enter the artist: ");
            s.setArtist(input.nextLine());

            System.out.println("Please enter the song's title");
            s.setTitle(input.nextLine());
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song m: songs){
            System.out.println(m.display());
        }

        //look for blue and print if found
        System.out.println("What song are you looking for? ");
        String titleToFind =input.nextLine();

        for (Song m: songs){
            if (m.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",m.display());
            }
        }
    }
}