package singletonpattern;

public class Loggertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Logger logger1 = Logger.getInstance();
		        logger1.log("This is the 1st log message.");
		        Logger logger2 = Logger.getInstance();
		        logger2.log("This is the 2nd log message.");
		        if (logger1 == logger2)
		        //if(logger1 != logger2)
		        {
		            System.out.println("Both logger instances are the same (Singleton confirmed).");
		        } else {
		            System.out.println("Different instances (Singleton failed).");
		        }
		    }
		}
