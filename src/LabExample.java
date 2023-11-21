import java.util.Objects;
import java.util.Random;
/**
 * LabExample class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class LabExample {

    /** highestOfTwo()
     * Takes two input doubles and compares them using if else if statements and sets the output variable
     * depending on the result
     *
     * @param num1 the first double input
     * @param num2 the second double input
     *
     * @return the output variable
     */
		 public double highestOfTwo(double num1, double num2){
             double highest;

             if (num1 > num2){ //compares to see if num1 is bigger than num2
                 highest = num1; //sets the highest to num1
             }
             else if (num1 == num2){
                 highest = -1; //if the same it gets set to -1
             }
             else{
                 highest = num2; //if num2 is the highest then it is set as highest
             }
			return highest;

		}

    /** calculateGRade()
     * takes an input int storing a mark and compares it to pre-determined numbers using if else if statements
     * once it find the values it sets an output variable storing the grade
     * if the mark is out of bounds it returns an invalid mark message
     *
     * @param mark takes an input int called mark
     *
     * @return the output variable
     */
		 public String calculateGrade(int mark) {
             String grade = " ";
             if (mark < 0){     //checks the mark and compares it to the grade boundaries
                 grade = "Invalid mark";     //sets invalid if mark is invalid
             }
             else if (mark <= 40){
                 grade = "Fail";        //sets the grade if mark is within the bounds
             }
             else if (mark <= 50){
                 grade = "3rd";
             }
             else if (mark <= 60){
                 grade = "2ii";
             }
             else if (mark < 70){
                 grade = "2i";
             }
             else if (mark <= 100){
                 grade = "1st";
             }
             else{
                 grade = "Invalid mark";
             }
             return grade;      //returns the grade
         }      //calculateGrade() method

    /** headsOrTails()
     * takes an input guess, sets two empty variables and creates a random number generator
     * it then compares the random number to heads or tails and storing it in the flip variable.
     * Next it then compares the random number to the flip variable to the guess variable using an if else statement
     * once it finds a match it sets the output variable
     *
     * @param guess an input string storing the guess
     *
     * @return the output variable
     */
		 public String headsOrTails(String guess) {
             String message;
             String flip;
             Random randomNum = new Random();       //random number generator
             int result = randomNum.nextInt(2);
             if (result == 0){
                 flip = "heads";    //comparing the random num  and storing it as a variable
             }
             else {
                 flip = "tails";
             }
             if (Objects.equals(guess, flip)){
                 message = "Correct: you guessed heads and I flipped heads";
             }  //comparing the guess to the flip variable and deciding the winner
             else {
                 message = "Incorrect: you guessed heads and I flipped tails";
             }
			return message;     //returns the output message
		}

    /** sumFromOneToWhat()
     * creates an empty int variable and runs a for loop adding the index of each loop to the empty variable
     * until it reaches the input bound
     *
     * @param input takes an input int which is the bound for the for loop
     *
     * @return the output variable
     */
		 public int sumFromOneToWhat(int input) {
             int output = 0;            //sets output number
             for (int i = 1; i <= input; i++){      //for loop stops at inputted number
                 output += i;       //adds the number to the output
             }
             return output;     //returns the output number
         }

    /** sumFromWhatToWhat()
     * creates an empty int variable and runs a for loop starting at the first input number
     * amd adding the index of each loop to the empty variable
     * it runs until it reaches the second input bound
     *
     * @param num1 first input int
     * @param num2 second input int
     *
     * @return the output variable
     */
		public int sumFromWhatToWhat(int num1, int num2) {
             int output = 0;        //sets output number
             for (int index = num1; index <= num2; index++){     //creates a for loop, starts at num1 and stops at num 2
                 output += index;       //adds output to the loop number
             }
			return output;      //returns the output
		}
}
