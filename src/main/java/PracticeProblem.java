/**
 * Lesson: String Manipulation
 * Author: Owais Ali Khan
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();
		System.out.println(sentence.contains("on"));
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String mango = input.nextLine();
		System.out.println(mango.toLowerCase().equals("mango"));
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.print("Input a letter: ");
		String letter = input.nextLine();
		System.out.println(word.indexOf(letter) + "\n" + word.lastIndexOf(letter));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();
		System.out.println("Your sentence is " + sentence.length() + " characters long");
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();
		System.out.print("Input a word to replace: ");
		String word = input.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word1 = input.nextLine();
		System.out.println(sentence.replace(word, word1));
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();
		System.out.println(sentence.trim().toUpperCase() + "\n" + sentence.trim().toLowerCase());
	}

	public static void q7() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.println(word.substring(0, 4) + "\n" + word.substring(word.length()-4));
	}

	public static void q8() {
		int x;
	}

}
