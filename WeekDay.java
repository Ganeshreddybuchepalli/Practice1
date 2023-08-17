import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = scan.nextInt();
		System.out.println(num);
		WeekDayDemo week = new WeekDayDemo();
		week.day(num);
		scan.close();
	}

}
class WeekDayDemo {

	public void day(int num) {
		if(num ==1) {
			System.out.println("Monday");
		}else if(num == 2) {
			System.out.println("Tuesday");
		}else if(num == 3) {
			System.out.println("Wednesday");
		}else if(num == 4) {
			System.out.println("Thursday");
		}else if(num == 5) {
			System.out.println("Friday");
		}else if(num == 6) {
			System.out.println("Saturday");
		}else if(num == 7) {
			System.out.println("Sunday");
		}else if(num>7) {
			System.out.println("Not Week day");
		}
	}
	
}
