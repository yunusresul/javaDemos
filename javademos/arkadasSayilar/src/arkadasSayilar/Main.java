package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int sayı1 = 220, sayı2 = 284, toplam1 = 0, toplam2 = 0;

		for(int i=0; i<sayı1; i++) {
			if(sayı1%i==0) {
				toplam1=toplam1+i;
			}
		}
		for(int i=0; i<sayı2; i++) {
			if(sayı2%i==0) {
				toplam2=toplam2+i;
			}
		}
		if(sayı1==toplam2 && sayı2==toplam1) {
			System.out.println("Bu sayılar arkadaştır");
		}
		else
		{
			System.out.println("Bu sayılar arkadaş değildir");
		}

	}

}
