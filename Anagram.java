package assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.print("Enter Second String: ");
		String s2 = sc.nextLine();

		String[] a1 = s1.toLowerCase().split("");
		String[] a2 = s2.toLowerCase().split("");

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("String is an Anagram");
        } else {
            System.out.println("String is not Anagram");
        }
        sc.close();
    }
	
}
