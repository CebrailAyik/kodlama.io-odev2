package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulma();

	}
	
	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0, 15, 55 };
		int aranacak = 5;
		boolean varMi = false;

		for(int sayi:sayilar)
		{
			if (sayi == aranacak) {
				varMi = true;
				break;
			}

		}
		String mesaj="";
		if(varMi)
		{
			mesaj = "Sayı var :"+aranacak;
			mesajVer(mesaj);
		}else
		{
			mesajVer("Sayı yoktur: "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
