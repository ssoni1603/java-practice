//we have two ways to find ASCII value of a character 
//1) By assigning a character to the int variable 2) By type casting character value as int

package practice.Basics;

public class AsciiCode {
	public static void main(String[] args) {
		char ch = 'S';
		int asciiCode = ch;
		int asciiValue = (int) ch;

		System.out.println("ASCII value of " + ch + " is: " + asciiCode);
	}
}
