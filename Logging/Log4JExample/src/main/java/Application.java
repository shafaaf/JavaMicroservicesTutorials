import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Application {

    private static Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        System.out.println("Hi");

        PropertyConfigurator.configure("log4j.properties");

        logger.debug("This is debug");
        logger.info("This is info");
        logger.warn("This is warn");
        logger.error("This is error");
        logger.fatal("This is fatal");
    }
}
