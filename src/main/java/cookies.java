import java.util.Scanner;

public class cookies;

{

	public static void main(String[] args) 

	{

		Scanner keyboard = new Scanner(System.in);
		double cookiesEaten, calories;
                
		System.out.println("Enter Number of Cookies Eaten: ");

		cookiesEaten = keyboard.nextDouble();

		calories = cookiesEaten * 30;

		System.out.println("Total Number of Calories Consumed: " + calories);

        }

}