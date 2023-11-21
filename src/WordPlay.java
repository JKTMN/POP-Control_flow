import java.util.Objects;
import java.util.Random;
/**
 * WordPlayStudent OutputTests class - part of Control Flow
 * Advanced String manipulation tasks examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class WordPlay {

    /** whatComesFirst()
     * takes two input words and compares the words to each other using compareToIgnoreCase() method and if else if
     * statements to find which comes first in the alphabet and stores it in an empty variable
     *
     * @param word1 first word input
     * @param word2 second word input
     *
     * @return the output variable
     */
	public String whatComesFirst(String word1, String word2) {
        String output;
        if (word1.compareToIgnoreCase(word2) < 0){      //compares the words while ignoring case
            output = word1 + " comes before " + word2 + " in the alphabet";
        }
        else if (word1.compareToIgnoreCase(word2) > 0){
            output = word2 + " comes before " + word1 + " in the alphabet";
        }
        else {
            if (word1.charAt(0) == Character.toUpperCase(word1.charAt(0))){     //substrings the words to fix the case
                output = word1.substring(0,1).toUpperCase() + word1.substring(1).toLowerCase() + " is the same as " + word2.toLowerCase();
            } else {
                output = word1.toLowerCase() + " is the same as " + word2.toLowerCase();
            }
        }
		return output;
    }

    /** backwardsString()
     * takes a string as an input and reverses it using a string builder
     *
     * @param word string inputted
     *
     * @return the reversed string
     */
	public String backwardsString(String word) {
        char[] wordToChar = word.toCharArray();     //sets the string to chars
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length()-1; i>= 0;i--){    //creates a for loop, that decreases from the strings length
            reverse.append(wordToChar[i]);      //sets the char to new position
        }
        return reverse.toString();      //outputs string
	}

    /** addressbook()
     * takes two arrays of names and numbers, formats them and puts them together in a new array
     *
     * @param names first input array containing names
     * @param numbers second input array containing numbers
     *
     * @return the new array
     */
	public String[] addressBook(String[] names, String[] numbers) {
        String[] phonebook = new String[names.length];  //new empty array with length of names
        for (int index = 0; index < names.length; index++){     //for loop that stops at length of names array
            phonebook[index] = names[index] + " " + numbers[index];     //puts the name and numbers into the array
        }
		return phonebook;   //returns the phonebook
	}

    /** rockPaperScissors()
     * takes an input containing the users choice, generates a random number and compares it to user choice
     * using if else if statement, once it finds a match it stores and returns output message
     *
     * @param userChoice input string storing users choice
     *
     * @return the output variable
     */
	public String rockPaperScissors(String userChoice) {
        Random randomNumberGenerator = new Random();        //random number generator
        int computer = randomNumberGenerator.nextInt(3);
        String winner;
        if (Objects.equals(userChoice, "rock") && computer == 2){   //compares the choice and the random number
            winner = "USER:rock vs COMP:scissors user wins";        // sets the winner
        } else if (Objects.equals(userChoice, "paper") && computer == 0) {
            winner = "USER:paper vs COMP:rock user wins";
        } else if (Objects.equals(userChoice, "scissors") && computer == 1){
            winner = "USER:scissors vs COMP:paper user wins";
        } else if (Objects.equals(userChoice, "scissors") && computer == 0){
            winner = "USER:scissors vs COMP:rock COMPUTER wins";
        } else if (Objects.equals(userChoice, "rock") && computer == 1){
            winner = "USER:rock vs COMP:paper COMPUTER wins";
        } else if (Objects.equals(userChoice, "paper") && computer == 2){
            winner = "USER:paper vs COMP:scissors COMPUTER wins";
        } else if (Objects.equals(userChoice, "scissors") && computer == 2){
            winner = "USER:scissors vs COMP:scissors it is a draw";
        } else if (Objects.equals(userChoice, "paper") && computer == 1){
            winner = "USER:paper vs COMP:paper it is a draw";
        } else {
            winner = "USER:rock vs COMP:rock it is a draw";
        }
		return winner;      //returns output method
	}       //rockPaperScissors() method
}
