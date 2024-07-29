package singleton.pattern;

public class LoggerTest {
	 public static void main(String[] args) {

	        Logger logger1 = Logger.getInstance();
	        logger1.log("First log message.");

	        Logger logger2 = Logger.getInstance();
	        logger2.log("Second log message.");

	        if (logger1 == logger2) {
	            System.out.println("Both same.");
	        } else {
	            System.out.println("Both different.");
	        }
	    }
}
