package Pertemuan6;
import java.util.Scanner;

public class LoopArray {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jumlah data yang akan dimasukkan : ");
		int x = input.nextInt();
		
		int[] data = new int[x];
		
		for (int i=0; i<x; i++) {
			System.out.print("Masukkan data ke "+(i+1)+" : ");
			data[i] = input.nextInt();
		}
		
		for (int i=0;i<x;i++) {
			System.out.println("data["+i+"]="+data[i]);
		}
		input.close();
	}
}