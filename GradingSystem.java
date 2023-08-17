import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks = ");
		int marks = scan.nextInt();
		System.out.println(marks);
		GradingSystemDemo g = new GradingSystemDemo();
		g.grade(marks);
		scan.close();
	}

}

class GradingSystemDemo {
	public void grade(int marks) {
		if (marks > 90 && marks <= 100) {
			System.out.println("Your Grade is A - PASS");
		} else if (marks > 75 && marks <= 90) {
			System.out.println("your Grade is B - PASS");
		} else if (marks > 60 && marks <= 75) {
			System.out.println("your Grade is C - PASS");
		} else if (marks > 45 && marks <= 60) {
			System.out.println("your Grade is D - PASS");
		} else if (marks > 35 && marks <= 45) {
			System.out.println("your Grade is E - PASS");
		} else if (marks < 34) {
			System.out.println("you are FAILED");
		}
	}
}
