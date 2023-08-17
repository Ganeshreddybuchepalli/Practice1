import java.util.Scanner;

public class VoterEligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age = ");
		int age = scan.nextInt(); 
		if(age>=18) {
			System.out.println("Yor are ready for Voting");
		}
		else if(age<=18){
			System.out.println("You are not eligible for Voting");
		scan.close();
	}
	}
}
