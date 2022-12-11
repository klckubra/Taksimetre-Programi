import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double km, tutar, taksimetre_basina = 2.20, acilis_ucreti = 10;
		
		System.out.println("Km cinsinden mesafeyi giriniz: ");
		km = scan.nextDouble();
		
		tutar = acilis_ucreti + (km*taksimetre_basina);
		
		if(tutar < 20) {
			tutar = 20;
		}
		System.out.println("Toplam tutar:  " + tutar);
	}

}
