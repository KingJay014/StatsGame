import java.util.Scanner;

public class Selecting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = reader.next();
		System.out.println("Your name is: " + name);

		System.out.println("Choose your race: Human, Half-Saiyan, Full Saiyain: ");
		String race = reader.next();
		if (race == 'Human' || 'Half-Saiyan' || 'Full Saiyain') {

		}
		
		System.out.println("Your race is: " + race);

	}

}
