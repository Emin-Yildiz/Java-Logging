import org.apache.log4j.PropertyConfigurator;

public class Main {

    public static void main(String[] args) {

        PropertyConfigurator.configure("src/main/resources/log4j.properties");

        Log.debug("Debug message");
        Log.error("Error message");
        Log.fatal("Fatal message");
        Log.warn("Warn message");
        Log.info("Info message");
        Log.trace("Trace message");
    }
}
