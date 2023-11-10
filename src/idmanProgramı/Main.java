package idmanProgram�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�dman Program�na Ho�geldiniz...");
		System.out.println("**********************");
		String idmanlar="Ge�erli Hareketler;\n"
				       + "Burpee\n"
				       + "Pushup(��nav)\n"
				       + "Situp\n"
				       + "Squat";
		System.out.println(idmanlar);
		System.out.println("**********************************");
	    System.out.println("�dman Program�n� Olu�turun...");
		System.out.print("Burpee say�s�n� giriniz: ");
		int burpee =scan.nextInt();
		System.out.print("Pushup say�s�n� giriniz: ");
		int pushup=scan.nextInt();
		System.out.print("Situp say�s�n� giriniz: ");
		int situp =scan.nextInt();	
		System.out.print("Squat say�s�n� giriniz: ");
		int squat =scan.nextInt(); 
		
		scan.nextLine();//YUKARDAK� NEXINT 'DEN SONRA A�AGIDA NEXTL�NE GEL�RSE BU KOMUTU YAZALIM.
		                 //YAZMAZSAK E�ER HAREKET TURU �LE SAYISINI PE�PE�E ALIYOR.KULLANICI G�REM�YOR.
		
		Idman �dman1 =new Idman(burpee, pushup, situp, squat);
		
		System.out.println("�dman�n�z ba�l�yor...");
		while(�dman1.idmanBittiMi()==false) {
			System.out.print("Hareket t�r�:");
			String tur=scan.nextLine();
			System.out.print("Bu hareketten ka� tane yapt�n�z:");
			int hSayi = scan.nextInt();
			scan.nextLine();
			�dman1.hareketYap(tur, hSayi);
		}
		System.out.println("�dman program�n�z bitti...");
		
	}

}
