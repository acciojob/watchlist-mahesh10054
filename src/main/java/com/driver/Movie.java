package com.driver;

public class Movie {
    private String mName;
    private int mDurationInMinutes;
    private double mImdbRating;

    public Movie() {
    }

    public Movie(String mName, int mDurationInMinutes, double mImdbRating) {
        this.mName = mName;
        this.mDurationInMinutes = mDurationInMinutes;
        this.mImdbRating = mImdbRating;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmDurationInMinutes() {
        return mDurationInMinutes;
    }

    public void setmDurationInMinutes(int mDurationInMinutes) {
        this.mDurationInMinutes = mDurationInMinutes;
    }

    public double getmImdbRating() {
        return mImdbRating;
    }

    public void setmImdbRating(double mImdbRating) {
        this.mImdbRating = mImdbRating;
    }
}
