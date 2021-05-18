import java.util.*;
import java.lang.Character;
import java.lang.String;

class charSentenceSwap {
    public static void main(String[] args){
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence:\t");
        String sentence = scanner.nextLine();

        System.out.print("Enter a character:\t");
        char character = scanner.next().charAt(0);

        String string2 = "";

        int sentLength = sentence.length();

        for(int k=0; k < sentLength; k++){

            if(sentence.charAt(k) == java.lang.Character.toUpperCase(character)){
				string2 = string2 + java.lang.Character.toLowerCase(sentence.charAt(k));
			} else if (sentence.charAt(k) == java.lang.Character.toLowerCase(character)){
				string2 = string2 + java.lang.Character.toUpperCase(sentence.charAt(k));
			} else {
				string2 = string2 + sentence.charAt(k);
			}
        }

        System.out.println("\nYour sentence:\t" + sentence);
        System.out.println("Your character:\t" + character);
        System.out.println("Your new sentence is:\t" + string2);
}
}