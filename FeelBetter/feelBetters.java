import java.util.Random;
import java.util.Scanner;

public class feelBetters {

    public static void main(String[] args) {

        Scanner moodChecker = new Scanner(System.in);

        //=================HappyMood Code==================

        System.out.println("What is your Current Mood? : (happy,sad,angry, or motivate)");
        String currentMood = moodChecker.nextLine();

        String happyQ1 = "Happiness grows when shared with others.";
        String happyQ2 = "Smile today — it looks good on you.";
        String happyQ3 = "Enjoy the little moments; they become big memories.";
        String happyQ4 = "Positive energy creates positive results.";
        String happyQ5 = "A happy mind creates a beautiful life.";

        Random happyMood = new Random();

        int happyQuote = happyMood.nextInt(5);

        if(currentMood.equalsIgnoreCase("happy")) {

            if(happyQuote == 0){
                System.out.println(happyQ1);
            }
            else if(happyQuote == 1){
                System.out.println(happyQ2);
            }
            else if(happyQuote == 2){
                System.out.println(happyQ3);
            }
            else if(happyQuote == 3){
                System.out.println(happyQ4);
            }
            else if(happyQuote == 4){
                System.out.println(happyQ5);
            }

        }

        //=================SadMood Code==================

        String sadQ1 = "Hard times often lead to great beginnings.";
        String sadQ2 = "Every storm eventually runs out of rain.";
        String sadQ3 = "You are stronger than this moment.";
        String sadQ4 = "Bad days are temporary, not permanent.";
        String sadQ5 = "Even the darkest night ends with sunrise.";

        Random sadMood = new Random();

        int sadQuote = sadMood.nextInt(4);

        if (currentMood.equalsIgnoreCase("sad")){
            if (sadQuote==0){
                System.out.println(sadQ1);
            }
            else if (sadQuote==1){
                System.out.println(sadQ2);
            }
            else if (sadQuote==2) {
                System.out.println(sadQ3);
            }
            else if (sadQuote==3) {
                System.out.println(sadQ4);                
            }
            else if (sadQuote==4) {
                System.out.println(sadQ5);
            }

        }

        //=================angryMood Code==================

        String angryQ1 = "Calmness is strength under control.";
        String angryQ2 = "Take a deep breath before making decisions.";
        String angryQ3 = "Anger fades faster when patience grows.";
        String angryQ4 = "Peace is more powerful than rage.";
        String angryQ5 = "Control your emotions before they control you.";

        Random angryMood = new Random();

        int angryQuote = angryMood.nextInt(4);

        if (currentMood.equalsIgnoreCase("angry")){
            if (angryQuote==0){
                System.out.println(angryQ1);
            }
            else if (angryQuote==1){
                System.out.println(angryQ2);
            }
            else if (angryQuote==2) {
                System.out.println(angryQ3);
            }
            else if (angryQuote==3) {
                System.out.println(angryQ4);                
            }
            else if (angryQuote==4) {
                System.out.println(angryQ5);
            }

        }

        //=================mortivateMood Code==================


        String motivatedQ1 = "Success starts with self-discipline.";
        String motivatedQ2 = "Small progress is still progress.";
        String motivatedQ3 = "Dream big. Start small. Act now.";
        String motivatedQ4 = "Push yourself because nobody else will do it for you.";
        String motivatedQ5 = "Your future is created by what you do today.";

        Random motivatedMood = new Random();

        int motivatedQuote = motivatedMood.nextInt(4);

        if (currentMood.equalsIgnoreCase("motivate")){
            if (motivatedQuote==0){
                System.out.println(motivatedQ1);
            }
            else if (motivatedQuote==1){
                System.out.println(motivatedQ2);
            }
            else if (motivatedQuote==2) {
                System.out.println(motivatedQ3);
            }
            else if (motivatedQuote==3) {
                System.out.println(motivatedQ4);                
            }
            else if (motivatedQuote==4) {
                System.out.println(motivatedQ5);
            }

        }

    }
}