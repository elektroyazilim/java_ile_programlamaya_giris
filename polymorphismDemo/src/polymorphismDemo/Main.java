package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// Polymorphism
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		
	}
}


//BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), 
//		new DatabaseLogger(), new ConsoleLogger()};
//for (BaseLogger logger : loggers) {
//	logger.Log("Log Mesaj�");
//}