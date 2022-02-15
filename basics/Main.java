import java.util.Random

public class Main {
    public static void main(String[] args) {

        public void pluralize (String thing, int thingCount) {
            String pluralizer = "";
            if (thingCount > 1 || thingCount == 0) {
                pluralizer = "s";
            }
            System.out.println("I own" + thingCount + thing + pluralizer);
        }

        public void flipNHeads ( int n){
            int headCount;
            int flips;
            while (headCount < n) {

                Random coinFlip = new Random();
                float coin = coinFlip.nextFloat();
                flips++;
                if (coin >= 0.5) {
                    headCount++;
                    System.out.println("heads");
                } else {
                    headCount = 0;
                    System.out.println("tails");
                }
            }
            System.out.println("It took" + flips + "flips to flip" + n + "heads in a row.")
        }
    }

}