package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	//CustomerManager oluþturulurken kiþi çalýþtýðý
	//logger ý da söylemek zorunda :
	public CustomerManager(BaseLogger logger) {
		//kurucu metot, new lerken çalýþýr
		this.logger = logger;
	}
	public void Add() {
		System.out.println("Müþteri eklendi");
		//loglama
		logger.Log(" Log Mesajý");
	}
}
