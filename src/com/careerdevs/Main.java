package com.careerdevs;
import com.careerdevs.ui.CLI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
   public static String[] words = {"guessing","these","words","is","very","easy"};
    public static void main(String[] args) {
	// write your code here
        menu();
    }
    public static void game(){
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        int guessCount = 0;
        int count = 0;
        String wordGuess = "";
        ArrayList<String> guesses = new ArrayList<String>();
        boolean complete = false;
        for(int i = 0; i < word.length();i++){
            wordGuess += "_";

        }
        System.out.println("WORD GUESSER");
        while(complete == false){
            System.out.println("Guesses Made: "+guessCount+"/7");
            System.out.println("Word: "+ wordGuess);
            System.out.println("Word: "+ word);
            System.out.println("Guesses: "+ guesses);
            char guess = CLI.readChar("Guess a Letter ");
            for(int i = 0; i<word.length();i++){
                if(guess == word.charAt(i)){
                    wordGuess =  wordGuess.substring(0, i) + guess + wordGuess.substring(i+1);
                }else{
                    count++;
                }
            }
            if(count == word.length()-1){

            }else if (count == word.length()-2){

            }else{
                guessCount++;
            }
            count = 0;

            guesses.add(Character.toString(guess));
            if(!wordGuess.contains("_")){
                System.out.println("Complete!");
                complete = true;
                menu();
            }
            if(guessCount > 7){
                System.out.println("You Lost!");
                complete = true;
                menu();
            }
        }


    }
    public static void menu(){
       int selection = CLI.readInt("1)Play\n2)Exit\nSelection",1,2);
        if(selection == 1){
            game();
        }
    }
}
