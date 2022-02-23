package inheritance;

import inheritance.review.Review;

import java.util.*;


public class Theater implements AddReviewable {
    public String name;
    public String description;
    public int starTier;
    public int priceTier;
    public ArrayList<String> movieList;


    public Theater(String name, String description, int priceTier) {
        this.name = name;
        this.description = description;
        this.priceTier = priceTier;
    }

    public void addMovie(String movie){
        if (!this.movieList.contains(movie)) {
        this.movieList.add(movie);
        }
    }

    public void removeMovie(String movie){
        if (!this.movieList.contains(movie)) {
            this.movieList.remove(movie);
        } else {
            System.err.println("Movie title not found in list.");
        }
    }

    @Override
    public String toString() {
        String movieListString = "";
        for (String movie: movieList) {
            movieListString += movie + ", ";
        }
        if (movieListString.length() > 2) {
            movieListString = movieListString.substring(0, movieListString.length() -2);
        }
        String theaterString = this.name + " : " + this.description + " Star Rating: " + starTier + " Price Tier: " + "$".repeat(priceTier) + " Currently playing: " + movieListString + ".";
        return theaterString;
    }

    public ArrayList<Review> reviewList = new ArrayList<>();

    @Override
    public void addReview(String reviewer, int reviewStars, String optionalMovieName) {
        int starSum = 0;
        Review reviewToAdd = new Review(this, reviewer, reviewStars, optionalMovieName);
        if (!reviewList.contains(reviewToAdd))
            if (optionalMovieName.length() > 0) {
                reviewToAdd.movieWasNamed = true;
            }
            reviewList.add(reviewToAdd);
            for (Review previousReview : reviewList) {
                starSum = starSum + previousReview.reviewStars;
            }
            // TODO: Refactor starTier average with non-integer division?
            this.starTier = starSum / reviewList.toArray().length;
    }



}
