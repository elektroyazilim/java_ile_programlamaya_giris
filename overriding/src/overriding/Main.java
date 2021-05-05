package overriding;

public class Main {

	public static void main(String[] args) {
		// Overriding
		BaseKrediManager[] krediler = new BaseKrediManager[] 
				{new TarimKrediManager(), new OgrenciKrediManager()};
		for (BaseKrediManager kredi : krediler) {
			System.out.println(kredi.hesapla(1000));
		}
	}
}
