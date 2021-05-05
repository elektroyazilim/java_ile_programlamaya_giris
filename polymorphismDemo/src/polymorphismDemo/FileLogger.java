package polymorphismDemo;

public class FileLogger extends BaseLogger{
	public void Log(String mesaj) {
		System.out.println("Log to file "+ mesaj);
	}
}
