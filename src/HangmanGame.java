import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HangmanGame {
    HangmanView view = new HangmanView();
    ArrayList<String> wordList = new ArrayList();
    String word;
    char[] wordArray;
    int wrongGuesses = 0;
    ArrayList<String> incorrectLetters = new ArrayList<>();
    boolean finished = false;


    public String selectDifficulty(String difficulty){
        if(difficulty.equalsIgnoreCase("hard")){
            return "HardHangmanWords.txt";
        }
        else{
            return "EasyHangmanWords.txt";
        }
    }

    public void initializeWords(String file){
        try{
            File fileToScan = new File(file);
            Scanner fileScanner = new Scanner(fileToScan);
            while(fileScanner.hasNext()){
                wordList.add(fileScanner.next());
            }
        }catch (FileNotFoundException e){
            System.err.println(e);
        }
    }

    public void wordSelect(){
        Random randy = new Random();
        word = wordList.get(randy.nextInt(wordList.size()));
        wordArray = new char[word.length()];
        for(int i = 0; i < word.length(); i++) {
            wordArray[i] = '_';
        }
    }

    public void guess(String guess){
        guess.toLowerCase();
        if(word.contains(guess)){
            correctGuess(guess);
        }
        else{
            incorrectGuess(guess);
        }
        printWordProgress();
    }


    public void correctGuess(String guess){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == guess.charAt(0)) {
                wordArray[i] = guess.charAt(0);
            }
        }
        for(char c : wordArray){
            if(c == '_'){
                return;
            }
        }
        finished = true;
        System.out.println("You guessed it!");
    }


    public void incorrectGuess(String guess){
        wrongGuesses++;
        incorrectLetters.add(guess);
        Collections.sort(incorrectLetters);
        if(wrongGuesses == 1){
            view.getOne();
            System.out.println("Incorrect letters: " + incorrectLetters.toString());
        }
        else if(wrongGuesses == 2){
            view.getTwo();
            System.out.println("Incorrect letters: " + incorrectLetters.toString());
        }
        else if(wrongGuesses == 3){
            view.getThree();
            System.out.println("Incorrect letters: " + incorrectLetters.toString());
        }
        else if(wrongGuesses == 4){
            view.getFour();
            System.out.println("Incorrect letters: " + incorrectLetters.toString());
        }
        else if(wrongGuesses == 5){
            view.getFive();
            System.out.println("Incorrect letters: " + incorrectLetters.toString());
        }
        else{
            view.getSix();
            System.out.println("You ran out of guesses. Better luck next time!");
            finished = true;
        }
    }


    public void printWordProgress(){
        for(char c : wordArray){
            System.out.print(c);
        }
        System.out.println();
    }

}
