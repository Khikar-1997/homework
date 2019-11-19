package com.company;

public class Main {
    public static void main(String args[]) {
        Movie movie = new Movie();
        movie.printMoviesTitlesAndRatings(movie.createMovieRating());
    }
}