package Pertemuan5;
import java.util.Scanner;

public class LoopDoWhile {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		do {
			System.out.println("===MENU APLIKASI===");
			System.out.println("1. Tambah Data");
			System.out.println("2. Lihat Data");
			System.out.println("3. Keluar");
			System.out.print("Masukkan Pilihan");
			x = input.nextInt();
			switch(x) {
				case 1: System.out.println("Data Ditambahkan"); break;
				case 2: System.out.println("Menampilkan Data"); break;
				case 3: System.out.println("Terima kasih"); break;
				default: System.out.println("Pilihan tidak valid");
			
			}
			
		} while (x != 3);
		input.close();
	}
}