package com.careerdevs;
import com.careerdevs.ui.CLI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
   public static String[] words = {"guessing","these","words","is","very","easy"};
    public static void main(String[] args) {
	// write your code here
        game();
    }
    public static void game(){
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        int guessCount = 0;
        String wordGuess = "";
        ArrayList<String> guesses = new ArrayList<String>();
        boolean complete = false;
        for(int i = 0; i < word.length();i++){
            wordGuess += "_";

        }
        while(complete == false){
            System.out.println("Guesses Made: "+guessCount);
            System.out.println("Word: "+ wordGuess);
            System.out.println("Word: "+ word);
            System.out.println("Guesses: "+ guesses);
            char guess = CLI.readChar("Guess a Letter ");
            for(int i = 0; i<word.length();i++){
                if(guess == word.charAt(i)){
                    wordGuess =  wordGuess.substring(0, i) + guess + wordGuess.substring(i+1);
                }
            }
            guesses.add(Character.toString(guess));
            if(!wordGuess.contains("_")){
                System.out.println("Complete!");
                complete = true;
            }

        }


    }
}
