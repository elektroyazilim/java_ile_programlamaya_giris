package abstractDemo;

public class Main {

	public static void main(String[] args) {
		// abstract class lar - design pattern
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MysqlDatabaseManager();
		customerManager.getCustomers();
	}
}
