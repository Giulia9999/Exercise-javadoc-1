package it.develhope.javadoc1;

/**
 * This class represents games with words
 * @author Giulia
 */
public class WordGames {
    /**
     * The goal of the method is to achieve the phrase "Hello word"
     * @param word It's a String type parameter and should represent the final word of "Hello word"
     * @return 2 strings
     */
    public String addHelloWord(String word){
        return "Hello" + word;
    }

    /**
     * This method returns the name and surname of someone
     * @param name A string type name of a person
     * @param surname A string type surname of a person
     * @return The concatenation of name and surname
     */
    public String getFullName(String name, String surname){
        return name + surname;
    }
}
