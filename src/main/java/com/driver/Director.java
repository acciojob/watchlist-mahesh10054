package com.driver;

public class Director {
    private String dName;
    private int dNumberOfMovies;
    private double dImdbRating;

    public Director() {
    }

    public Director(String dName, int dNumberOfMovies, double dImdbRating) {
        this.dName = dName;
        this.dNumberOfMovies = dNumberOfMovies;
        this.dImdbRating = dImdbRating;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public int getdNumberOfMovies() {
        return dNumberOfMovies;
    }

    public void setdNumberOfMovies(int dNumberOfMovies) {
        this.dNumberOfMovies = dNumberOfMovies;
    }

    public double getdImdbRating() {
        return dImdbRating;
    }

    public void setdImdbRating(double dImdbRating) {
        this.dImdbRating = dImdbRating;
    }
}
