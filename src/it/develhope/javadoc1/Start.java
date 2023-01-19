package it.develhope.javadoc1;

/**
 * This class is a tester class and hasthe main method in it.
 * @author Giulia
 */
public class Start {
    /**
     * This method is used as a tester for the methods of WordGames class
     * @param args It takes an argument of String type and stores it in a string array.
     */
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        String helloWord = wordGames.addHelloWord(" word");
        String completeName = wordGames.getFullName("Mario", "Rossi");

        System.out.println(helloWord);
        System.out.println(completeName);
    }
}
