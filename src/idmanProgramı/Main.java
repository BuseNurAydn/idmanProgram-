package idmanProgramý;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýdman Programýna Hoþgeldiniz...");
		System.out.println("**********************");
		String idmanlar="Geçerli Hareketler;\n"
				       + "Burpee\n"
				       + "Pushup(Þýnav)\n"
				       + "Situp\n"
				       + "Squat";
		System.out.println(idmanlar);
		System.out.println("**********************************");
	    System.out.println("Ýdman Programýný Oluþturun...");
		System.out.print("Burpee sayýsýný giriniz: ");
		int burpee =scan.nextInt();
		System.out.print("Pushup sayýsýný giriniz: ");
		int pushup=scan.nextInt();
		System.out.print("Situp sayýsýný giriniz: ");
		int situp =scan.nextInt();	
		System.out.print("Squat sayýsýný giriniz: ");
		int squat =scan.nextInt(); 
		
		scan.nextLine();//YUKARDAKÝ NEXINT 'DEN SONRA AÞAGIDA NEXTLÝNE GELÝRSE BU KOMUTU YAZALIM.
		                 //YAZMAZSAK EÐER HAREKET TURU ÝLE SAYISINI PEÞPEÞE ALIYOR.KULLANICI GÝREMÝYOR.
		
		Idman ýdman1 =new Idman(burpee, pushup, situp, squat);
		
		System.out.println("Ýdmanýnýz baþlýyor...");
		while(ýdman1.idmanBittiMi()==false) {
			System.out.print("Hareket türü:");
			String tur=scan.nextLine();
			System.out.print("Bu hareketten kaç tane yaptýnýz:");
			int hSayi = scan.nextInt();
			scan.nextLine();
			ýdman1.hareketYap(tur, hSayi);
		}
		System.out.println("Ýdman programýnýz bitti...");
		
	}

}
