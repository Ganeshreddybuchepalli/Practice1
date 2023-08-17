import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the CGPA = ");
		double cgpa = scan.nextDouble();
		if(cgpa>=8.0) {
			System.out.println("Welcome to TechClub");
		}
		else 
			System.out.println("You are not Eligible for TechClub");
		scan.close();
	}

}
