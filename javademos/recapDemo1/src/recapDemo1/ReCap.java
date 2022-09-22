package recapDemo1;

public class ReCap {

	public static void main(String[] args) {
		int sayi1 = 320, sayi2 = 55, sayi3 = 40, enBuyuk;
		enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println("En büyük sayı = " + enBuyuk);
	}

}
