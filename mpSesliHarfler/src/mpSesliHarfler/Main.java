package mpSesliHarfler;

public class Main {

	public static void main(String[] args) {
		// Kal�n sesli ve ince sesli harfleri bulma
		char harf = 'A';

		// kal�n sesliler : a,o,u,�
		// ince sesliler : e,�,�,i
		switch (harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println(harf + " kal�n seslidir..");
			break;
		case 'E':
		case '�':
		case '�':
		case '�':
			System.out.println(harf + " ince seslidir..");
			break;

		default:
			System.out.println("Ge�ersiz");
			break;
		}
	}
}
