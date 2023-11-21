/**
 * SalaryCalculator class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */

public class SalaryCalculator {

    /** salaryTax()
     * takes a double as an input and compares it to pre-determined tax bands using if else if statements
     * once it finds a match it puts the input salary through an equation to take away the tax
     *
     * @param salary takes a double input storing a salary
     *
     * @return the new salary
     */
	 public double salaryTax(double salary) {
         if (salary > 40000){       // compares salary to a number
             salary = (salary - salary /100 * 50);      //if so, calculates the tax
         }
         else if (salary >= 30000){
             salary = (salary - salary / 100 * 30);
         }
         else {
             salary = (salary - salary / 100 * 15);
         }
         return salary;     // returns the salary
	}

    /** calculateNI()
     * takes two inputs and compares the second using if else if statement
     * puts the first input through an equation to work out the new salary
     * if second input is invalid returns the salary
     *
     * @param salary first input containing the salary
     * @param band second input containing the national insurance band
     *
     * @return the output variable
     */
	public  double calculateNI(double salary, char band) {
         double output = ' ';     //creates an empty variable
         if (band =='A'){        //compares NI band to the letter
             output = (salary - (salary / 100 * 12));     //if match calculates how much is taken away
             // sets the second variable to the string value of the first
         }
         else if (band =='B'){
             output = (salary - (salary / 100 * 5.85));
         }
         else if (band =='C'){
             output = (salary - (salary / 100 * 2));
         }
         else{
           output = salary;     //if NI band is anything else, returns the salary without any changes
         }
		return output;     //returns second variable
	}

    /** salaryTotal()
     * takes an array of salaries and adds them to an empty variable using a for each loop
     *
     * @param salaries the input array storing the salaries
     *
     * @return the variable
     */
	 public double salaryTotal(double[] salaries) {
         double total = 0;
         int index = 0;//sets total to 0
         for (double salary : salaries){      //creates a for loop with the limit being 2
             total += salaries[index];
             index++; //adds array element to the total
         }

         return total;      //returns the total
	}

    /** salaryAverage()
     * takes an array of salaries, stores them in a variable called sum using a for loop,
     * returns the average of the sum
     *
     * @param salaries the input array storing the salaries
     *
     * @return the sum divided by the amount of salaries in the array using the .length method
     */
	 public double salaryAverage(double[] salaries) {
         double sum = 0;
         int index = 0;
         for (double salary: salaries) { //for each loop running on salaries in salaries
             sum += salaries[index];
             index++;
         }
         return sum / salaries.length;      //returns total divided by the salaries length to work out the average
	}

    /** salaryIncrease()
     *
     * takes an array of salaries as an input, puts the salary through an equation to add 5% then adds it to a new array
     *
     * @param salaries an array of salaries
     *
     * @return the new array storing the new salaries
     */
	 public double[] salaryIncrease(double[] salaries) {
         double[] salariesIncrease = new double[salaries.length];     //creates new empty array
         int index = 0;
         for (double salary: salaries){      //creates a for each loop running on salaries in salaries
             salariesIncrease[index] = (salaries[index] /100 * 5 + salaries[index]);  //puts the salary increase into a new array
             index++;
         }
		return salariesIncrease;        //returns the array
	}
}
