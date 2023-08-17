import java.util.Scanner;

public class CheckingMainMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int number = scan.nextInt();
		Checking p = new Checking();
		p.even(number);
		p.divisible(number);
		p.positive(number);
		scan.close();
	}
}
class Checking {

	public void even(int number) {
		if(number%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number id odd");
		}
	}

	public void divisible(int number) {
		if(number%8==0) {
			System.out.println("Number is multiple of 8");
		}else {
			System.out.println("Number is not multiple of 8");
		}
	}

	public void positive(int number) {
		if(number>0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number id Negative");
		}
	}

}
