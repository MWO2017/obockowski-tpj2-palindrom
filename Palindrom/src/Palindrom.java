import java.util.Scanner;

public class Palindrom {

	public static boolean check(String s) {
		// dobre zastosowanie na rekurencje, jak dojdzie do srodka to jest ok
		String slowo=s;
		if (slowo.length()<=1) {
			return true;
		}
		else {
			char pierwsza=slowo.charAt(0);
			char ostatnia=slowo.charAt(slowo.length()-1);
			if (pierwsza==ostatnia) {
				String noweSlowo="";
				for (int i=1;i<slowo.length()-2;i++) {
					noweSlowo+=Character.toString(slowo.charAt(i));
					check(noweSlowo);
				}
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("podaj co chcesz sprawdzic, czy jest Palindromem: ");
		Scanner scanner=new Scanner(System.in);
		String slowo=scanner.nextLine();
		String noweSlowo=slowo.replaceAll("[^A-Za-z]+","").toLowerCase();
		System.out.println(noweSlowo);
		
		boolean wynik=check(noweSlowo);
		if (wynik == true) {
			String tekst=String.format("tekst: %s\n _JEST_ palindromem",slowo);
			System.out.println(tekst);
		}
		else {
			String tekst=String.format("tekst: %s\n _NIE_ jest palindromem",slowo);
			System.out.println(tekst);
		} 
	}
}
