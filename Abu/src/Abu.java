import java.util.Scanner;
public class Abu {
	public static void main(String[] args) {
		String name;
		int age;
		double income;
		int money = 0;
		int debt = 0;
		int retirementAge = 0;
		
		Scanner keyboard = new Scanner (System.in);
		
		//Personal Info 
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		
		System.out.println(name + ", what is your age?");
		age = keyboard.nextInt();
		
		
		//Questionnaire
		if (age >= 18) {
			System.out.println("What is the total amount of money in your bank accounts?");
			money = keyboard.nextInt();
			System.out.println("How much debt do you have?");
			debt = keyboard.nextInt();
			System.out.println("What year do you want to retire?");
			retirementAge = keyboard.nextInt();
		}
		
		// if-else
		if (age >= 18 && debt == 0) {
			if(money>=3000 && retirementAge >= 60) {
				System.out.println("You should invest in: Roth IRA: ");
				System.out.println("https://www.investopedia.com/terms/r/rothira.asp");
			} else if (money >= 2000 && retirementAge >= 55){
				System.out.println("You should invest in: Buy property: ");
				System.out.println("https://www.investopedia.com/mortgage/real-estate-investing-guide/");
			} else if (money >= 1000 && retirementAge >= 60){
				System.out.println("You should: Buy stocks: ");
				System.out.println("https://www.investopedia.com/articles/basics/06/invest1000.asp");
			} else if (money >= 2000 && retirementAge >= 70){
				System.out.println("You should: Buy mutual funds: ");
				System.out.println("https://www.investopedia.com/terms/m/mutualfund.asp");
			} else if (money < 1000) {
				System.out.println("Save up!");
			} else {
				System.out.println("Invalid Input.");
			}
		} else if (age >= 18 && debt >= 0) {
			System.out.println("Save up!");
		} else if (age < 18) {
			System.out.println("You're too young.");
		} else {
			System.out.println("Invalid Input.");
		}
		
		keyboard.close();
		/*Test your Java knowledge
		System.out.println("Take a short quiz to test your financial knowlege! It will be fun!");
		System.out.print("A. Yes! Sounds fun");
		System.out.println("B. No, thank you!" );
		String choice = keyboard.nextLine();
		
		
		if (choice.equalsIgnoreCase("A") 
			System.out.println("What" )	
	*/
		
		
		
		
	}

}