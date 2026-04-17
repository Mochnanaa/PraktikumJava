package Pertemuan6;
public class ArrayIndex {
	public static void main(String[]args) {
		String[] komponenPc = {"Mobo","CPU","GPU","RAM"};
		
		System.out.println("Komponen 1 : "+ komponenPc[0]);
		System.out.println("Komponen 2 : "+ komponenPc[1]);
		System.out.println("Komponen 3 : "+ komponenPc[2]);
		
		komponenPc[1] = "PSU";
		System.out.println("Komponen 2 Setelah diubah: "+ komponenPc[1]);
		
		System.out.println("Jumlah Komponen : "+ komponenPc.length);
	}
}