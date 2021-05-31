package com.thoughtworks;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(){}
    public Movie(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio)
    {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public Movie[] getPG(Movie movies[])
    {
        ArrayList<Movie> PGMovies = new ArrayList<>();
        for(Movie i:movies)
        {
            if(i.rating.startsWith("PG"))
                PGMovies.add(i);
        }
        return PGMovies.toArray(new Movie[PGMovies.size()]);
    }
    public static void main(String[] args)
    {
        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie = new Movie();
        Movie firstMovie = new Movie("Casino Royale","Eon Productions","PG-13");
        movies.add(firstMovie);
    }

}
