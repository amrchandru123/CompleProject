

import org.apache.logging.log4j.*;



public class ChanLog {

  
	private static Logger logger =LogManager.getLogger(ChanLog.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PropertyConfigurator.configure("log4j2.properities");
		logger.info("this is chan");
		System.out.println("i am chan");
		logger.debug("this is chandru nature");
		System.out.println("i m good");
		logger.error("this is chandru nature");
		System.out.println("i m cool");
		
	}

}
