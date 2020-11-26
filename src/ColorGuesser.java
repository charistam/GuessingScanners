import java.util.Scanner;

public class ColorGuesser {
    public static void main(String[] args) {
        Scanner colorGuesser = new Scanner(System.in);
        System.out.println("I'm thinking of a color. Please enter a guess.");
        String guess = colorGuesser.nextLine();
        boolean running = true;
        while (running) {
             if (guess.equals("blue")) {
                System.out.println("Correct!");
                running = false;
            } else {
                System.out.println("Incorrect :(");
                String guess2 = colorGuesser.nextLine();
                if(guess2.equals("blue")) {
                    System.out.println("Correct!");
                    running = false;
                }
            }
        }
        colorGuesser.close();
    }
}
