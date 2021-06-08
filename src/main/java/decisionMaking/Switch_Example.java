package decisionMaking;

public class Switch_Example {
	/**
	  The Java switch statement executes one statement from multiple conditions. It
	  is like if-else-if ladder statement. The switch statement works with byte,
	  short, int, long, enum types, String and some wrapper types like Byte, Short,
	  Int, and Long. Since Java 7, you can use strings in the switch statement.
	 */
	public enum Day {
		Sun, Mon, Tue, Wed, Thu, Fri, Sat
	};

	public void SwitchExample() {
		// Declaring a variable for switch expression
		int number = 20;
		// Switch expression
		switch (number) {
		// Case statements
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		// Default case statement
		default:
			System.out.println("Not in 10, 20 or 30");
		}
	}

	// Char Example
	public void SwitchVowelExample() {
		char ch = 'O';
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}

	// SwitchStringExample

	public void SwitchStringExample() {
		// Declaring String variable
		String levelString = "Expert";
		int level = 0;
		// Using String in Switch expression
		switch (levelString) {
		// Using String Literal in Switch case
		case "Beginner":
			level = 1;
			break;
		case "Intermediate":
			level = 2;
			break;
		case "Expert":
			level = 3;
			break;
		default:
			level = 0;
			break;
		}
		System.out.println("Your Level is: " + level);
	}

	// NestedSwitchExample
	public void NestedSwitchExample() {
		char branch = 'C';
		int collegeYear = 4;
		switch (collegeYear) {
		case 4:
			switch (branch) {
			case 'C':
				System.out.println("Data Communication and Networks, MultiMedia");
				break;
			}
		}
	}

	// JavaSwitchEnumExample

	@SuppressWarnings("incomplete-switch")
	public void JavaSwitchEnumExample() {
		Day[] DayNow = Day.values();
		for (Day Now : DayNow) {
			switch (Now) {
			case Sun:
				System.out.println("Sunday");
				break;
			case Mon:
				System.out.println("Monday");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Switch_Example example=new Switch_Example();
		example.SwitchExample();
		//example.SwitchVowelExample();
		//example.SwitchStringExample();
		//example.NestedSwitchExample();
		//example.JavaSwitchEnumExample();
		
	}
}