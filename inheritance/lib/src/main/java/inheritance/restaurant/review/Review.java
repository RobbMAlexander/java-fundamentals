package inheritance.restaurant.review;

import inheritance.restaurant.Restaurant;

public class Review extends Restaurant
{
    public String reviewerID;
    public int reviewStars;

    public Review(Restaurant restaurant, String _reviewerID, int _reviewStars)
    {
        super(restaurant.name, restaurant.starTier, restaurant.priceTier);
        name = restaurant.name;
        starTier = restaurant.starTier;
        priceTier = restaurant.priceTier;
        reviewerID = _reviewerID;
        reviewStars = _reviewStars;
    }


    @Override
    public String toString() {
        String reviewString = "Reviewer " + reviewerID + " gave " + name + " a " + reviewStars + "-star review.";
        return reviewString;
    }

}
