import java.util.Scanner;

public class MonthCheckUsingSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month = ");
		String month = scan.next();
		System.out.println(month);
		scan.close();
		MonthChecking Month = new MonthChecking();
		Month.checkMonth(month);
	}

}
class MonthChecking{

	public void checkMonth(String month) {
		switch(month) {
		case "January":
		case "February":
		case "March":
		{
			System.out.println("Quarter 1");
			break;
		}
		case "April":
		case "May":
		case "June":
		{
			System.out.println("Quarter 2");
			break;
		}
		case "July":
		case "Agust":
		case "September":
		{
			System.out.println("Quarter 3");
			break;
		}
		case "October":
		case "November":
		case "December":
		{
			System.out.println("Quarter 4");
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
		}
		}
	}
	
}