import java.util.Scanner;

public class deliverable1 {
	public static void main(String[] args) {
		
		//Scanner lets user define eventType and partySize 
		Scanner event = new Scanner(System.in);
		
		System.out.println("Please enter your event type as casual, semi-formal, or formal:");
		
		String eventType = event.nextLine();
		
		Scanner party = new Scanner(System.in);
		
		System.out.println("Please enter your number of guests:");
				
		int partySize = party.nextInt();	
		
		//Defines strings to be used in the output, that change depending upon input
		String type = "";
		
		String meal = "";
		
		String prep = "";
		
		//if/else statements to determine the output for a given event type
		if(eventType.equals("casual")) {
			type = "casual event for";
			meal = "sandwiches";}
		
		else if(eventType.equals("semi-formal")) {
			type = "semi-formal event for";
			meal = "fried chicken";}
		
		else if(eventType.equals("formal")) {
			type = "formal event for";
			meal = "chicken parmesan";}
		
		//if/else statements to determine the output for a given party size
		if(partySize == 1) {
			prep = "in the microwave";}
		
		else if(partySize > 1 && partySize <= 12) {
			prep = "in your kitchen";}
		
		else if(partySize > 12) {
			prep = "by a caterer";}
		
		//if statement that outputs error if the eventType input is wrong
		if(!(eventType.equals("casual") || eventType.equals("semi-formal") || eventType.equals("formal"))) {
			System.out.println("Please enter your event type as casual, semi-formal, or formal.");}
		
		//if statement that outputs an error if the partySize input is wrong
		if(partySize <= 0) {
			System.out.println("Please enter a party size greater than zero.");}
		
		//if statement that gives the correct output given the correct inputs
		else if((eventType.equals("casual") || eventType.equals("semi-formal") || eventType.equals("formal")) && partySize > 0){
		String result = "Since you're hosting a " 
		+ type + " " + partySize + " participant(s), you should serve " 
		+ meal + " prepared " + prep + ".";
		
		System.out.println(result);}
		
		event.close();
		
		party.close();	
	}
}
