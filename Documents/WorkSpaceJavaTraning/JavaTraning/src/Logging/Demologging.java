package Logging;


	import org.apache.log4j.*;


	public class Demologging {

	    static Logger log = Logger.getLogger(Demologging.class.getName());

	    

	    public static void main(String[] args) {

	        BasicConfigurator.configure();

	        

	        log.info("Starting up...");

	        

	        log.setLevel(Level.WARN);

	        log.info("This message should not appear!");

	        

	        try {

	            // Divide by zero.

	            int x = 5;

	            final int y = 20 / (5 - x);

	        } catch (Exception e) {

	            log.error("Oops!", e);

	        }

	    }

	}



