/**
 * LabExampleStudentOutputTests - part of Control Flow
 * For testing the LabExample class
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class LabExampleStudentOutputTests {

	public static void main(String[] args) {
		
		LabExample labExample = new LabExample();
		//Task1 test
		System.out.println(labExample.highestOfTwo(10, 20));
	
		//Task 2 test
		System.out.println(labExample.calculateGrade(50));

		//Task 3 test
		System.out.println(labExample.headsOrTails("heads"));
		
		//Task 4
		System.out.println(labExample.sumFromOneToWhat(10));
		
		//Task 5
		System.out.println(labExample.sumFromWhatToWhat(5, 10));
	}
}
