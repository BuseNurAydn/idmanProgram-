package idmanProgramý;

public class Idman {
	private int burpeeSayisi;
	private int pushupSayisi;
	private int situpSayisi;
	private int squatSayisi;
	public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
		this.burpeeSayisi = burpeeSayisi;
		this.pushupSayisi = pushupSayisi;
		this.situpSayisi = situpSayisi;
		this.squatSayisi = squatSayisi;
	}
	public int getBurpeeSayisi() {
		return burpeeSayisi;
	}
	public void setBurpeeSayisi(int burpeeSayisi) {
		this.burpeeSayisi = burpeeSayisi;
	}
	public int getPushupSayisi() {
		return pushupSayisi;
	}
	public void setPushupSayisi(int pushupSayisi) {
		this.pushupSayisi = pushupSayisi;
	}
	public int getSitupSayisi() {
		return situpSayisi;
	}
	public void setSitupSayisi(int situpSayisi) {
		this.situpSayisi = situpSayisi;
	}
	public int getSquatSayisi() {
		return squatSayisi;
	}
	public void setSquatSayisi(int squatSayisi) {
		this.squatSayisi = squatSayisi;
	}
	public void hareketYap(String hareketTuru,int sayi) {
		if(hareketTuru.equals("Burpee")) {
			burpeeYap(sayi);
		}else if(hareketTuru.equals("Pushup")){
			pushupYap(sayi);
		}else if(hareketTuru.equals("Situp")) {
			situpYap(sayi);
		}else if(hareketTuru.equals("Squat")) {
			squatYap(sayi);
		}else {
			System.out.println("Geçersiz hareket yaptýnýz...");
		}
	}
	public void burpeeYap(int sayi) {
	  if(burpeeSayisi==0) {
		  System.out.println("Yapacak burpee kalmadý.");
	  }
	  if(burpeeSayisi-sayi<0) {
		  System.out.println("Tebriklerr!.Hedefinizi geçtiniz.");
		  burpeeSayisi=0;
		  System.out.println("Kalan burpee: "+ burpeeSayisi);
	  }else {
		  burpeeSayisi -= sayi;
		  System.out.println("Kalan burpee sayýsý: " + burpeeSayisi);
	  }
		
	}
	public void pushupYap(int sayi) {
		 if(pushupSayisi==0) {
			  System.out.println("Yapacak pushup kalmadý.");
		  }
		  if(pushupSayisi-sayi<0) {
			  System.out.println("Tebriklerr!.Hedefinizi geçtiniz.");
			  pushupSayisi=0;
			  System.out.println("Kalan pushup: "+ pushupSayisi);
		  }else {
			  pushupSayisi -= sayi;
			  System.out.println("Kalan pushup sayýsý: " + pushupSayisi);
		  }
		
	}
	public void situpYap(int sayi) {
		if(situpSayisi==0) {
			  System.out.println("Yapacak situp kalmadý.");
		  }
		  if(situpSayisi-sayi<0) {
			  System.out.println("Tebriklerr!.Hedefinizi geçtiniz.");
			  situpSayisi=0;
			  System.out.println("Kalan situp: "+ situpSayisi);
		  }else {
			  situpSayisi -= sayi;
			  System.out.println("Kalan situp sayýsý: " + situpSayisi);
		  }
	}
	public void squatYap(int sayi) {
		if(squatSayisi==0) {
			  System.out.println("Yapacak squat kalmadý.");
		  }
		  if(squatSayisi-sayi<0) {
			  System.out.println("Tebriklerr!.Hedefinizi geçtiniz.");
			  squatSayisi=0;
			  System.out.println("Kalan squat: "+ squatSayisi);
		  }else {
			  squatSayisi -= sayi;
			  System.out.println("Kalan squat sayýsý: " + squatSayisi);
		  }
	}
    public boolean idmanBittiMi() {
        
        return (burpeeSayisi == 0 ) && (pushupSayisi == 0 ) && (situpSayisi == 0 ) && (squatSayisi == 0 );
        
    }
	
}
