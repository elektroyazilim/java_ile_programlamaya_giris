package polymorphismDemo;

public class ConsoleLogger extends BaseLogger{
	public void Log(String mesaj) {
		System.out.println("Log to console : " + mesaj);
	}
}
