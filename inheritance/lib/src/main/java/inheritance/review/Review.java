package inheritance.review;

import inheritance.*;

//TODO: refactor to interface-- implementation of addReview ?
public class Review
{
    public String reviewer;
    public int reviewStars;
    public String venue;
    public String name;
    public String movieName;
    public boolean movieWasNamed = false;

    public Review(AddReviewable venue, String _reviewer, int _reviewStars, String optionalMovieName)
    {
        //super(venue, venue.starTier, venue.priceTier);
        name = venue.name;
        reviewer = _reviewer;
        reviewStars = _reviewStars;
        movieName = optionalMovieName;
    }

    @Override
    public String toString() {
        String reviewString = "Reviewer " + reviewer + " gave " + venue + " a " + reviewStars + "-star review.";
        return reviewString;
    }

}
