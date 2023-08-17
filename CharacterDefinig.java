import java.util.Scanner;

public class CharacterDefinig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		checkCharacter(ch);
		sc.close();
	}

	private static void checkCharacter(char ch) {
		if (ch >= 65 && ch <= 90) {
			System.out.println("Entered character is a Upper Case Alphabets");
		}
		else if(ch >= 97 && ch <= 122) {
			System.out.println("Entered character is a Lower Case Alphabets");
		}
		else if(ch >= 48 && ch <= 57) {
			System.out.println("Entered character is a Numerical Value");
		} 
		else {
			System.out.println("Entered character is a Special Character");
		}
	}

}
