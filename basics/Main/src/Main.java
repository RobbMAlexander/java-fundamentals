import java.time.LocalDateTime;
import java.util.Random;

public class Main {
        public static void pluralize (String thing, int thingCount) {
            String pluralizer = "";
            if (thingCount > 1 || thingCount == 0) {
                pluralizer = "s";
            }
            System.out.println("I own " + thingCount + " " + thing + pluralizer);
        }

        public static void flipNHeads(int n) {
            int headCount = 0;
            int flips = 0;
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
            System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
        }

        public static void  clock() {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            String hourTens = "";
            String minuteTens = "";
            String secondsTens = "";
            if (hour < 10) {
                hourTens = "0";
            }
            if (minute < 10) {
                minuteTens = "0";
            }
            if (second < 10) {
                secondsTens = "0";
            }
            String currentTime = hourTens + hour + ":" + minuteTens + minute + ":" + secondsTens + second;
            System.out.println(currentTime);
            int lastSecond = second;
            while (true) {
                    now = LocalDateTime.now();
                    hour = now.getHour();
                    minute = now.getMinute();
                    second = now.getSecond();
                    currentTime = hourTens + hour + ":" + minuteTens + minute + ":" + secondsTens + second;
                if (second != lastSecond) {
                    System.out.println(currentTime);
                    lastSecond = second;
                }
            }
        }

    public static void main(String[] args) {
          pluralize("giraffe", 0);
          pluralize("dog", 1);
          pluralize("parakeet", 8);
          flipNHeads(1);
         flipNHeads(2);
         flipNHeads(5);
         clock();
    }
}