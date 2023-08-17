import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input from end user
		System.out.println("Enter number = ");
		int number = sc.nextInt();
		//Calling method
		evenOrOddChecking(number);
		sc.close();
	}

	private static void evenOrOddChecking(int number) {
		//Checking given number is even or odd
		if(number%2==0) {        //For off number(num%2!=0)
			//print even message
			System.out.println("Given Number is Even");
		}else {
			//print odd message
			System.out.println("Given Number is Odd");
		}
	}

}
