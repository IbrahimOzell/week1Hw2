
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hello world uygulaması
		System.out.println("Merhaba JAVA");

//------------------------------------------------------------------

		// Variables
		int ogrenciSayisi = 10;
		String mesaj = "Öğrenci sayısı : ";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("Öğrenci sayım : " + ogrenciSayisi);
		System.out.println("Öğrenci sayım : " + ogrenciSayisi);
		System.out.println("Öğrenci sayım : " + ogrenciSayisi);

//------------------------------------------------------------------

		// Data types
		double sayi = 12.5;
		sayi = -129;

		char karakter = 'A';

		boolean dogruMu = false;

//-------------------------------------------------------------------

		// Conditionals=şart blokları if
		int sayi1 = 20;
		if (sayi1 < 20) {
			System.out.println("Sayı 20'den küçüktür");
		} else if (sayi1 == 20) {
			System.out.println("Sayı 20'ye eşittir");
		} else {
			System.out.println("Sayı 20'den büyüktür");
		}
//--------------------------------------------------------------------

		// recap1
		int sayi2 = 10;
		int sayi3 = 5;
		int sayi4 = 20;
		int enBuyukSayi = sayi2;

		if (enBuyukSayi < sayi3) {
			enBuyukSayi = sayi3;
		}

		if (enBuyukSayi < sayi4) {
			enBuyukSayi = sayi4;
		}
		System.out.println("En büyük sayı :" + enBuyukSayi);

//------------------------------------------------------------------

		// switch
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

//---------------------------------------------------------------------
		
		//Döngüler-for
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("For Döngüsü Bitti");

//----------------------------------------------------------------------
		
		//While
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
//-----------------------------------------------------------------------
		
		//Do-While
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
//------------------------------------------------------------------------
		
		//Arrays
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		
		for(int k=0;k<ogrenciler.length;k++) {
			System.out.println(ogrenciler[k]);
		}
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
//-------------------------------------------------------------------------
		
		//recap2
		double[] myList = {1.2,6.3,4.3,5.6};
		double total=0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max=number;
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);
		
//--------------------------------------------------------------------------
		
		//multidimensional array
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		
		for(int a = 0; a<=2;a++) {
			System.out.println("--------------------");
			for(int b=0;b<=2;b++) {
				System.out.println(sehirler[a][b]);		
				
			}
		}
		
//---------------------------------------------------------------------------
		
		//strings
		String mesaj1 = "Bugün hava çok güzel.";		
		System.out.println(mesaj1);
		
		System.out.println("Eleman sayısı : "+mesaj1.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println(mesaj1.concat(" Yaşasın!"));
		System.out.println(mesaj1.startsWith("B"));
		System.out.println(mesaj1.endsWith("."));
		char[] karakterler = new char[5];
		mesaj1.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj1.indexOf("a"));
		System.out.println(mesaj1.lastIndexOf("a"));
		
		String yeniMesaj = mesaj1.replace(" ","-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj1.substring(2,5));
		
		for (String kelime : mesaj1.split(" ")) {
			System.out.println(kelime);
		
		}
		
		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.toUpperCase());
		System.out.println(mesaj1.trim());
		
//-----------------------------------------------------------------------------
		
		//miniProjeAsalSayı
		int number  = 25;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int m=2; m<number;m++) {
			if(number % m == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
		
//----------------------------------------------------------------------------------
		
		//sesliHarfler
		char harf='Ü';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf");
				break;
		default:	
			    System.out.println("İnce sesli harf");
		
		}
		
//----------------------------------------------------------------------------------
		
		//mukemmelSayi
		int number1 = 6;
		int total1 = 0;
		
		for(int z=1;z<number1;z++) {
			if(number1 % z ==0) {
				total1 = total1 +z;
			}
		}
		
		if(total1 == number1) {
			System.out.println("Mükemmel sayıdır");
		}else {
			System.out.println("Mükemmel sayı değildir");
		}
		
//------------------------------------------------------------------------------------
		
		//miniProjeArkadaşSayılar
		int sayi5=221;
		int sayi6=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int q=1;q<sayi5;q++) {
			if(sayi5%q==0) {
				toplam1 = toplam1 +q;
			}
		}
		
		for(int q=1;q<sayi6;q++) {
			if(sayi6%q==0) {
				toplam2 = toplam2 +q;
			}
		}
		
		if(sayi5==toplam2 && sayi6==toplam1) {
			System.out.println("Bu iki sayı arkadaştır");
		}else {
			System.out.println("Bu iki sayı arkadaş değildir");
		}
		
//-------------------------------------------------------------------------------------
		
		//miniProjeSayıBulma
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		
		for(int sayi7 : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut değildir");
		}
	}

}

