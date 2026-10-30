package javaExam.problem3;

import java.util.ArrayList;
import java.util.Scanner;

class Song {
    private String title;
    private String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void showInfo() {
        System.out.println(title + " - " + artist);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Song> playlist = new ArrayList<Song>();

        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            String title = input.next();
            String artist = input.next();

            Song song = new Song(title, artist);
            playlist.add(song);
        }

        System.out.println("==나의 플레이리스트==");

        for (Song song : playlist) {
            song.showInfo();
        }

        System.out.println("총 " + playlist.size() + "곡");
    }
}
