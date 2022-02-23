package inheritance;

import inheritance.review.Review;

import java.util.ArrayList;

public class Shop implements AddReviewable{
    public String name;
    public String description;
    public int starTier;
    public int priceTier;


    public Shop(String name, String description, int priceTier) {
        this.name = name;
        this.description = description;
        this.priceTier = priceTier;
    }

    @Override
    public String toString() {
        String dollarSigns = "";
        for (int i = 0; i < this.priceTier; i++) {
            dollarSigns += "$";
        }
        String shopString = this.name + " : " + this.description + " " + starTier + " PriceTier: " + dollarSigns;
        return shopString;
    }

    public ArrayList<Review> reviewList = new ArrayList<>();

    @Override
    public void addReview(String reviewer, int reviewStars, String optionalMovieName) {
        int starSum = 0;
        Review reviewToAdd = new Review(this, reviewer, reviewStars, optionalMovieName);
        if (!reviewList.contains(reviewToAdd))
            reviewList.add(reviewToAdd);
        for (Review previousReview : reviewList) {
            starSum = starSum + previousReview.reviewStars;
        }
        // TODO: Refactor starTier average with non-integer division?
        this.starTier = starSum / reviewList.toArray().length;
    }


}
