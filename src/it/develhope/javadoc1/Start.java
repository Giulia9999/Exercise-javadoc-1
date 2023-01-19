package it.develhope.javadoc1;

/**
 * This class is a tester class and hasthe main method in it.
 * @author Giulia
 */
public class Start {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        String helloWord = wordGames.addHelloWord(" word");
        String completeName = wordGames.getFullName("Mario", "Rossi");

        System.out.println(helloWord);
        System.out.println(completeName);
    }
}
