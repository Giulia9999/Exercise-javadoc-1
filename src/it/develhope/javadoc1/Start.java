package it.develhope.javadoc1;

public class Start {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        String helloWord = wordGames.addHelloWord(" word");
        String completeName = wordGames.getFullName("Mario", "Rossi");

        System.out.println(helloWord);
        System.out.println(completeName);
    }
}
