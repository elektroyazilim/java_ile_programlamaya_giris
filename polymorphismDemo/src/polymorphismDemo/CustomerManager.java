package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	//CustomerManager olu�turulurken ki�i �al��t���
	//logger � da s�ylemek zorunda :
	public CustomerManager(BaseLogger logger) {
		//kurucu metot, new lerken �al���r
		this.logger = logger;
	}
	public void Add() {
		System.out.println("M��teri eklendi");
		//loglama
		logger.Log(" Log Mesaj�");
	}
}
