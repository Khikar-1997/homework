package com.company;

import java.util.Random;

public class Movie {
    private String title;
    private int rating;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie() {
    }

    //region Getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //endregion

    Random random = new Random();

    public int[] createMovieRating() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public void printMoviesTitlesAndRatings(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println();
        for (int i = 0; i < 1; i++) {
            if (maximum == array[0]) {
                this.title = "Titanic";
                System.out.println(this.title + " - " + array[0]);
            }
            if (maximum == array[1]) {
                this.title = "The Revenant";
                System.out.println(this.title + " - " + array[1]);
            }
            if (maximum == array[2]) {
                this.title = "The Hobbit";
                System.out.println(this.title + " - " + array[2]);

            }
            if (maximum == array[3]) {
                this.title = "Braveheart";
                System.out.println(this.title + " - " + array[3]);
            }
            if (maximum == array[4]) {
                this.title = "Public Enemies";
                System.out.println(this.title + " - " + array[4]);
            }
            if (maximum == array[5]) {
                this.title = "The Big Short";
                System.out.println(this.title + " - " + array[5]);
            }
            if (maximum == array[6]) {
                this.title = "Casino";
                System.out.println(this.title + " - " + array[6]);
            }
            if (maximum == array[7]) {
                this.title = "Scent of a Woman";
                System.out.println(this.title + " - " + array[7]);
            }
            if (maximum == array[8]) {
                this.title = "Gotti";
                System.out.println(this.title + " - " + array[8]);
            }
            if (maximum == array[9]) {
                this.title = "Avatar";
                System.out.println(this.title + " - " + array[9]);
            }
        }

    }
}
