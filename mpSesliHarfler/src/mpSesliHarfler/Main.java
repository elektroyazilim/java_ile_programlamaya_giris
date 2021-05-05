package mpSesliHarfler;

public class Main {

	public static void main(String[] args) {
		// Kalýn sesli ve ince sesli harfleri bulma
		char harf = 'A';

		// kalýn sesliler : a,o,u,ý
		// ince sesliler : e,ö,ü,i
		switch (harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println(harf + " kalýn seslidir..");
			break;
		case 'E':
		case 'Ö':
		case 'Ü':
		case 'Ý':
			System.out.println(harf + " ince seslidir..");
			break;

		default:
			System.out.println("Geçersiz");
			break;
		}
	}
}
