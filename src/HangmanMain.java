public class HangmanMain {
    
    public static void main(String[] args) {
        HangmanGame g = new HangmanGame();

        g.view.printScreen();

        String difficulty = g.view.getInput("Would you like easy or hard words?");

        g.initializeWords(g.selectDifficulty(difficulty));

        g.wordSelect();

        g.view.getZero();

        g.printWordProgress();

        while (g.finished != true) {

           String guess = g.view.getInput("Guess a letter");

           g.guess(guess);

        }
    }
}
