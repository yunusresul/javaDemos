package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Yunus";
		ogrenciler[1]="Resul";
		ogrenciler[2]="Özkan";
		ogrenciler[3]="Fatma";
		
		for(String ogrenci:ogrenciler)
		{
			System.out.println(ogrenci);
		}
		System.out.println("------------------");
		
		for(int i=0; i<ogrenciler.length; i++)
		{
			System.out.println(ogrenciler[i]);
		}
	}

}
