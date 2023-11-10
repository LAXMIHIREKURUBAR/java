
public class Characterw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character character = new Character('a');
		  System.out.println(character);
		  isDigit();
		  isLetter();
		  isLowerCase();
		  isUpperCase();
		  isWhitespace();
		  toUpperCase();
		  toLowerCase();
		  toStringTest();
		 }

		 public static void isLetter() {
		  System.out.println(Character.isLetter('A'));
		  System.out.println(Character.isLetter('0'));
		 }
		 
		 public static void isDigit() {
			  // print false as A is character
			  System.out.println(Character.isDigit('A'));
              System.out.println(Character.isDigit('0'));
			 }
		 public static void isWhitespace() {
			  System.out.println(Character.isWhitespace('A'));
			  System.out.println(Character.isWhitespace(' '));
			  System.out.println(Character.isWhitespace('\n'));
			  System.out.println(Character.isWhitespace('\t'));

			  // ASCII value of tab
			  System.out.println(Character.isWhitespace(9));

			  System.out.println(Character.isWhitespace('9'));
			 }

			 public static void isUpperCase() {
			  System.out.println(Character.isUpperCase('A'));
			  System.out.println(Character.isUpperCase('a'));
			  System.out.println(Character.isUpperCase(65));
			 }

			 public static void isLowerCase() {
			  System.out.println(Character.isLowerCase('A'));
			  System.out.println(Character.isLowerCase('a'));
			  System.out.println(Character.isLowerCase(97));
			 }

			 public static void toUpperCase() {
			  System.out.println(Character.toUpperCase('a'));
			  System.out.println(Character.toUpperCase(97));
			  System.out.println(Character.toUpperCase(48));
			 }
			 
			 public static void toLowerCase() {
			  System.out.println(Character.toLowerCase('A'));
			  System.out.println(Character.toLowerCase(97));
			  System.out.println(Character.toLowerCase(48));
			 }

			 public static void toStringTest() {
			  System.out.println(Character.toString('x'));
			  System.out.println(Character.toString('Y'));
			 }

			

	}


