import java.util.Scanner;

public class HangmanView {
    Scanner scanner = new Scanner(System.in);
    
    public void getZero(){
        System.out.println(
                        "   +----+\n" +
                        "   |    |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "       ---\n");
    }

    public void getOne(){
        System.out.println(
                        "   +----+\n" +
                        "   |    |\n" +
                        "   O    |\n" +
                        "        |\n" +
                        "        |\n" +
                        "       ---\n");
    }

    public void getTwo(){
        System.out.println(
                        "   +----+\n" +
                        "   |    |\n" +
                        "   O    |\n" +
                        "   |    |\n" +
                        "        |\n" +
                        "       ---\n");
    }

    public void getThree(){
        System.out.println(
                        "   +----+\n" +
                        "   |    |\n" +
                        "   O /  |\n" +
                        "   |    |\n" +
                        "        |\n" +
                        "       ---\n");
    }

    public void getFour(){
        System.out.println(
                "   +----+\n" +
                        "   |    |\n" +
                        " \\ O /  |\n" +
                        "   |    |\n" +
                        "        |\n" +
                        "       ---\n");
    }

    public void getFive(){
        System.out.println(
                "   +----+\n" +
                        "   |    |\n" +
                        " \\ O /  |\n" +
                        "   |    |\n" +
                        "    \\   |\n" +
                        "       ---\n");
    }
    /**
     * Prints an ASCII art String to represent the hangman with six parts on the board -
     * the head, body, right arm, left arm, right leg, and left leg. Displayed when six incorrect guesses were made.
     */
    public void getSix(){
        System.out.println(
                "   +----+\n" +
                        "   |    |\n" +
                        " \\ O /  |\n" +
                        "   |    |\n" +
                        "  / \\   |\n" +
                        "       ---\n");
    }

    public String getInput(String displayText){
        System.out.println(displayText);
        return scanner.nextLine();
    }


    public void printScreen(){
        System.out.println("WELCOME TO HANGMAN!");
    }

    public static void main(String[] args) {
        HangmanView h = new HangmanView();
        h.getZero();
        h.getOne();
        h.getTwo();
        h.getThree();
        h.getFour();
        h.getFive();
        h.getSix();
    }
}
