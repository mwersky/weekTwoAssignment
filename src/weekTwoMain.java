import java.util.Scanner;

public class weekTwoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//I just wanted to say upfront that I had a little fun with my coding later in this assignment.
		//I noticed that user input wasn't a part of the assignment despite touching on it so I went ahead and added it myself to part of this assignment.
		//Enjoy!
		
		String breakLn = "__________"; //obligatory sorting tool for myself.
		
		
		//Part I
		System.out.println("Part one. Boolean Expression followed by the Answer");
		System.out.println(" "); //Is there a better way to do this? -Mitch
		
		//True && False
		System.out.println("true && false");
		System.out.println(true && false);
		System.out.println(" "); // surely there has to be...
		
		//true || False
		System.out.println("true || false");
		System.out.println(true || false);
		System.out.println(" "); //Like come on.
		
		//false && false
		System.out.println("false && false");
		System.out.println(false && false);
		System.out.println(" "); // and again.
		
		//false || (true && false)
		System.out.println("false || (true && false)");
		System.out.println(false || (true && false));
		System.out.println(" "); //it's futile.
		
		//false || 1<5
		System.out.println("false || 1<5");
		System.out.println(false || 1<5);
		System.out.println(" "); // just kidding. I'll stop now
		
		//5 >= 4 && 1 > 3
		System.out.println("5 >= 4 && 1 > 3");
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(" ");
		
		//10 < 4 || 1 > 4
		System.out.println("10 < 4 || 1 > 4");
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(" ");
		
		//12 >= 2 && 1 < 24
		System.out.println("12 >= 2 && 1 < 24");
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println(" ");
		
		//"Hello".charAt(0) == 'h'
		System.out.println("\"Hello\".charAt(0) == 'h'");
		System.out.println("Hello".charAt(0) == 'h');
		System.out.println("--I didn't actually know what this one did until I put it into eclipse! Very Cool!");
		System.out.println(" ");
		System.out.println(breakLn);
		
		//Part II
		System.out.println("Boolean Variables and additional Variables");
		System.out.println(" ");
		System.out.println("I've added a scanner to this. Please follow the instructions as given to see the rest of the script");
		System.out.println(" ");
		System.out.println(breakLn);
		
		//this Portion gathers the information needed for all your Boolean Variables. You MUST answer in lower case because I don't know how to check for missed entries yet
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi there! My name is Hodge podge and I'm here to help you with your day! Will you please tell me your name?");
		String yourName = sc.next();
		System.out.println("Thanks " + yourName + "! I will now ask you a series of true or false questions! Please be patient while I gather the necessary data.");
		System.out.println(breakLn);
		
		System.out.println("It is hot outside: ");
		boolean isHotOutside = sc.nextBoolean();
		System.out.println("It is a Week day: ");
		boolean isWeekday = sc.nextBoolean();
		System.out.println("You have cash in your pocket: ");
		boolean hasMoneyInPocket = sc.nextBoolean();
		System.out.println(" ");
		System.out.println(breakLn);
		
		//I put gaps in the "quiz" to make it more readable.
		System.out.println("Please Enter the Following to the nearest penny. (example 22.99)");
		System.out.println(" ");
		
		System.out.println("The Cost of milk is $");
		double costOfMilk = sc.nextDouble();
		System.out.println("How much cash is in your wallet, " + yourName + "? $");
		double moneyInWallet = sc.nextDouble();
		System.out.println(breakLn);
		
		//Split this one off because I decided to use doubles for all my money variables. Just to use more variety for practic. Also a customer service remark for extra charm!
		System.out.println("Thanks for your patience, " + yourName + ". For my last question on a scale of 1-10 how thirsty are you? Your Answer: ");
		int thirstLevel = sc.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(breakLn);
		System.out.println("Thanks, " + yourName + "! Based on your answers I have determined the following:");
		
		
		sc.close(); //I Googled this because it was annoying me.
		
		//This section here does all the calculations requested by the assignment but I knew that this wasn't going to be the most exciting way to provide the Data to the user SOOOO...
		boolean shouldBuyIcecream = (isHotOutside == true && hasMoneyInPocket == true);
		boolean willGoSwimming = (isHotOutside == true && isWeekday == false);
		boolean isAGoodDay = (isHotOutside == true && hasMoneyInPocket == true && isWeekday == false);
		boolean willBuyMilk = (isHotOutside == true && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk);
		
		//The payoff! I really wanted to use a much of my skills on this weeks assignment as I could so I'm so pleased this worked out.
		if (shouldBuyIcecream == true) {
			System.out.println("You should go get some Icecream today!");
			} else {
			System.out.println("Maybe hold off on the Icecream...");
			}
		
		if (willGoSwimming == true) {
			System.out.println("Additionally perhaps consider swimming?");
		} else {
			System.out.println("And maybe skip the pools today.");
		}
		
		if (isAGoodDay == true) {
			System.out.println("In fact today does seem like a great day, overall.");
		} else {
			System.out.println("In fact maybe just stay inside. Today is not your day.");
		}
		
		if (willBuyMilk == true) {
			System.out.println("Oh and one last thing. Pick up some milk while you're out. ;)"); 
		} else {
			System.out.println("That's all I got for you! Hope I helped. :)");
		}			
	} //P.S. I had my wife take my quiz in the console and it made her laugh so I'd call that a win :)
	

}
