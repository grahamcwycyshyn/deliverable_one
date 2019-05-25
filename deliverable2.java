import java.util.Scanner;

public class deliverable2 {
	public static void main(String[] args) {
		
		//Scanner lets user define string1 and string2
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Please enter your first string:");
		
		String string1 = input1.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Please enter your second string:");
		
		String string2 = input2.nextLine();
		
		//sum variables will give the Unicode sum for the strings
		int sum1 = 0;
		
		//The for loops run across the length of the strings and sum the Unicode values
		for(int i = 0; i < string1.length(); i++) {
			sum1 += string1.codePointAt(i);
			System.out.println(string1.charAt(i) + ": " + string1.codePointAt(i));}
		
		System.out.println("Total for your first string: " + sum1);
		
		int sum2 = 0;
		
		for(int i = 0; i < string2.length(); i++) {
			sum2 += string2.codePointAt(i);
			System.out.println(string2.charAt(i) + ": " + string2.codePointAt(i));}
		
		System.out.println("Total for your second string: " + sum2);	
		
		System.out.println("Difference between totals as absolute value: " + Math.abs(sum1-sum2));
		
		input1.close();
		
		input2.close();
		
	}
}
	

