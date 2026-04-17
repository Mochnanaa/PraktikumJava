package Pertemuan5;
import java.util.Scanner;

public class LoopWhile {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		int x = 9;
		int y = 0;
		while (x != y) {
			System.out.println("Tebak angka 1-10");
			y = input.nextInt();
			if (x != y) {
				System.out.println("Tebakan salah, Coba lagi");
			}
		}
		System.out.println("Tebakan Benar!!");
		input.close();
	}
}
