package ThirdWeek.homework2.polymorphismDemo;

public class FileLogger extends BaseLogger{

	public void Log(String message) {
		System.out.println("Logged to file : "+message);
	}
}
